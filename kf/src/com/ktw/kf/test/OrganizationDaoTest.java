package com.ktw.kf.test;

import com.ktw.kf.dao.OrganizationDao;
import com.ktw.kf.model.Organization;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void testGetOrganizations() {
        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();

        Map<String, Object> condition1 = new HashMap<String, Object>();
        condition1.put("NAME", "ORG_SN");
        condition1.put("RELA", "LIKE");
        condition1.put("VALUE", "'%ORG_1%'");
        params.add(condition1);

        Map<String, Object> condition2 = new HashMap<String, Object>();
        condition2.put("NAME", "ORG_NAME");
        condition2.put("RELA", "LIKE");
        condition2.put("VALUE", "'%ORG_1%'");
        params.add(condition2);

        List<Organization> orgs = OrganizationDao.getOrganizations(params);
        for (Organization o : orgs) {
            System.out.println(o.toString());
        }
    }
}