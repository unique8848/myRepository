package com.ktw.kf.dao;

import com.ktw.kf.db.DBUtil;
import java.sql.Connection;

/**
 * Created by kevin on 12/30/14.
 */
public abstract class BaseDao {
    protected static Connection conn = DBUtil.getConnection();
}
