package test;

import db.DBUtil;
import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Connection;

public class DBUtilTest extends TestCase {

    @Test
    public void testGetConnection() throws Exception {
        Connection conn = DBUtil.getConnection();
        assertEquals(2,conn);
    }

    @Test
    public void testGetConnection2() throws Exception {
        Connection conn = DBUtil.getConnection();
        assertEquals(2,2);
    }
}