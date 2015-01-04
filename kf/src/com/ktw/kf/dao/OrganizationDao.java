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

    public static Organization getOrganizationByName(String strName) {
        Organization o = null;
        String strSql = "SELECT ID, PARENT_ID, ORG_SN, ORG_NAME FROM KF.KF_ORG WHERE 1=1 AND ORG_NAME = ?";
        try {
            PreparedStatement psmt = conn.prepareStatement(strSql);
            psmt.setString(1, strName);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                o = new Organization();
                o.setId(rs.getInt("ID"));
                o.setParentId(rs.getInt("PARENT_ID"));
                o.setOrgSn(rs.getString("ORG_SN"));
                o.setOrgName(rs.getString("ORG_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return o;
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
