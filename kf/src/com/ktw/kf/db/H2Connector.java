package com.ktw.kf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by kevin on 1/4/15.
 */
public class H2Connector implements IConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/kf";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "jsf";
    private static Connection conn = null;

    private H2Connector() {
    }

    private static H2Connector instance = new H2Connector();

    public static H2Connector getInstance() {
        if (instance == null)
            instance = new H2Connector();
        return instance;
    }

    @Override
    public Connection getConnection() {
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: H2 driver malfunction.");
        } catch (SQLException e) {
            System.out.println("Error: Connection not available.");
        }
        return conn;
    }
}
