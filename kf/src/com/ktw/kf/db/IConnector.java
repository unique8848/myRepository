package com.ktw.kf.db;

import java.sql.Connection;

/**
 * Created by kevin on 1/4/15.
 */
public interface IConnector {
    Connection getConnection();
}
