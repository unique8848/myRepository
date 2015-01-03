package com.ktw.kf.dao;

import com.ktw.kf.model.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by kevin on 12/30/14.
 */
public class UserDao extends BaseDao {
    public static void addUser(User u) {
        String strSql = "INSERT INTO KF_USER " +
                "(ORG_ID, USER_NAME, USER_PWD, LOGIN_NAME) " +
                "VALUES " +
                "(?, ?, ?, ?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(strSql);
            psmt.setInt(1, 1);
            psmt.setString(2, u.getUserName());
            psmt.setString(3, u.getUserPwd());
            psmt.setString(4, u.getUserName());
            psmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void
}
