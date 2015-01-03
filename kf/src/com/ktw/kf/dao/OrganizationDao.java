package com.ktw.kf.dao;


import com.ktw.kf.model.Organization;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
