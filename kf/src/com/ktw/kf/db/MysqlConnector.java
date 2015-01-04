package com.ktw.kf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by kevin on 1/4/15.
 */
public class MysqlConnector implements IConnector {
    private static Connection conn = null;

    private MysqlConnector() {
    }

    private static MysqlConnector instance = new MysqlConnector();

    public static MysqlConnector getInstance() {
        if (instance == null)
            instance = new MysqlConnector();
        return instance;
    }

    @Override
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kf", "root", "jsf");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Mysql driver malfunction.");
        } catch (SQLException e) {
            System.out.println("Error: Connection not available.");
        }
        return conn;
    }
}
