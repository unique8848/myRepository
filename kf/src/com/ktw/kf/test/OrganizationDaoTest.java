package com.ktw.kf.test;

import com.ktw.kf.dao.OrganizationDao;
import com.ktw.kf.model.Organization;
import junit.framework.TestCase;
import org.junit.Test;

public class OrganizationDaoTest extends TestCase {
    @Test
    public void testAddOrganization() throws Exception {
        Organization o = new Organization();
        for (int i = 0; i < 20; i++) {
            o.setParentId(1);
            o.setOrgSn("org_" + i);
            o.setOrgName("org_" + i);
            OrganizationDao.addOrganization(o);
        }
    }
}