package com.ktw.kcf.dao;


import com.ktw.kcf.db.DBUtil;

import java.sql.Connection;

/**
 * Created by kevin on 12/30/14.
 */
public abstract class BaseDao {
    protected static Connection conn = DBUtil.getConnection();
}
