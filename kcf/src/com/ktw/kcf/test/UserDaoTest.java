package com.ktw.kcf.test;

import com.ktw.kcf.dao.UserDao;
import com.ktw.kcf.model.User;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDaoTest extends TestCase {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddUser() throws Exception {
        User u = new User();
        for(int i=0; i<100; i++){
            u.setOrgId(1);
            u.setLoginName("user" + i);
            u.setUserName("userName" + i);
            u.setUserPwd("123456");
            UserDao.addUser(u);
        }
    }

    @Test
    public void testGetUsers() throws Exception{

    }
}