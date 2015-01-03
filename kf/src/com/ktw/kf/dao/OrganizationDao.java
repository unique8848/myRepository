package com.ktw.kf.dao;


import com.ktw.kf.model.Organization;
import com.ktw.kf.util.SqlHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by kevin on 12/30/14.
 */
public class OrganizationDao extends BaseDao {
    public static void addOrganization(Organization o) {
        String strSql = "INSERT INTO KF_ORG " +
                "(PARENT_ID, ORG_SN, ORG_NAME) " +
                "VALUES (?, ?, ?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(strSql);
            psmt.setInt(1, o.getParentId());
            psmt.setString(2, o.getOrgSn());
            psmt.setString(3, o.getOrgName());
            psmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Organization> getOrganizations(List<Map<String, Object>> params) {
        List<Organization> orgs = new ArrayList<Organization>();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ID, PARENT_ID, ORG_SN, ORG_NAME FROM KF_ORG WHERE 1=1");
        try {
            PreparedStatement psmt = conn.prepareStatement(SqlHelper.unWrapConditions(sb, params));
            ResultSet rs = psmt.executeQuery();

            Organization org = null;
            while (rs.next()) {
                org = new Organization();
                org.setId(rs.getInt("ID"));
                org.setParentId(rs.getInt("PARENT_ID"));
                org.setOrgSn(rs.getString("ORG_SN"));
                org.setOrgName(rs.getString("ORG_NAME"));
                orgs.add(org);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orgs;
    }
}
