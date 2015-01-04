package com.ktw.kf.db;

/**
 * Created by kevin on 1/4/15.
 */
public class ConnectorFactory {
    public static IConnector getH2Connector() {
        return H2Connector.getInstance();
    }

    public static IConnector getMysqlConnector() {
        return MysqlConnector.getInstance();
    }
}
