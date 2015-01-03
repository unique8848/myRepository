package com.ktw.kcf.dao;


import com.ktw.kcf.model.Function;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by kevin on 12/30/14.
 */
public class FunctionDao extends BaseDao {
    public static void addFunction(Function f) {
        String strSql = "INSERT INTO KTW_FMK_FUNCTION " +
                "(PARENT_ID, FUNC_NO, FUNC_NAME, FUNC_SN, FUNC_DESC) " +
                "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(strSql);
            psmt.setInt(1, f.getParentId());
            psmt.setString(2, f.getFuncNo());
            psmt.setString(3, f.getFuncName());
            psmt.setInt(4, f.getFuncSn());
            psmt.setString(5, f.getFuncDesc());
            psmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateFunction(Function f) {
        String strSql = "UPDATE KTW_FMK_FUNCTION";
    }

    public static void deleteFunction(int id) {
        String strSql = "DELETE FROM KTW_FMK_FUNCTION WHERE ID = ?";
        try {
            PreparedStatement psmt = conn.prepareStatement(strSql);
            psmt.setInt(1, id);
            psmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Function> getFunctions(List<Map<String, Object>> params) {
        List<Function> funcs = new ArrayList<Function>();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ID, PARENT_ID, FUNC_NO, FUNC_NAME, FUNC_SN, FUNC_DESC FROM KTW_FMK_FUNCTION WHERE 1=1");
        if (null != params && params.size() > 0) {
            for (Map<String, Object> param : params) {
                sb.append(" AND " + param.get("NAME") + " " + param.get("RELA") + " " + param.get("VALUE"));
            }
        }

        try {
            PreparedStatement psmt = conn.prepareStatement(sb.toString());
            System.out.println(sb.toString());
            ResultSet rs = psmt.executeQuery();

            Function func = null;
            while (rs.next()) {
                func = new Function();
                func.setId(rs.getInt("ID"));
                func.setParentId(rs.getInt("PARENT_ID"));
                func.setFuncNo(rs.getString("FUNC_NO"));
                func.setFuncName(rs.getString("FUNC_NAME"));
                func.setFuncSn(rs.getInt("FUNC_SN"));
                func.setFuncDesc(rs.getString("FUNC_DESC"));
                funcs.add(func);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return funcs;
    }
}
