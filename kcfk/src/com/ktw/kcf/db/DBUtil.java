package com.ktw.kcf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Kevin on 2014/12/30.
 */
public class DBUtil {
    private static String URL = "jdbc:mysql://localhost:3306/KTW_FMK";
    private static String USER = "root";
    private static String PWD = "jsf";

    private static Connection conn = null;

    static {
        try {
//            Class.forName("org.gjt.mm.mysql.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动加载失败！");
        } catch (SQLException e) {
            System.out.println("获取数据库连接失败！");
            //e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
