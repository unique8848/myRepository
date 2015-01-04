package test;

import com.ktw.kf.db.DBUtil2;
import junit.framework.TestCase;

import java.sql.Connection;

public class DBUtil2Test extends TestCase {

    public void testGetConnection() throws Exception {
        Connection conn = DBUtil2.getConnection();
        assertEquals(conn, null);
    }
}