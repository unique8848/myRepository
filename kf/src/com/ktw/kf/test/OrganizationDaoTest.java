package com.ktw.kf.test;

import com.ktw.kf.dao.OrganizationDao;
import com.ktw.kf.model.Organization;
import com.ktw.kf.util.SqlHelper;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrganizationDaoTest extends TestCase {
    @Test
    public void testAddOrganization() throws Exception {
        /*Organization o = new Organization();
        o.setParentId(0);
        o.setOrgSn("ktw");
        o.setOrgName("DreamTech headquarter");
        OrganizationDao.addOrganization(o);

        o.setParentId(OrganizationDao.getOrganizationByName("DreamTech headquarter").getId());
        o.setOrgSn("sales");
        o.setOrgName("Sales department");
        OrganizationDao.addOrganization(o);

        o.setParentId(OrganizationDao.getOrganizationByName("DreamTech headquarter").getId());
        o.setOrgSn("dev");
        o.setOrgName("Develpment department");
        OrganizationDao.addOrganization(o);

        o.setParentId(OrganizationDao.getOrganizationByName("DreamTech headquarter").getId());
        o.setOrgSn("legal");
        o.setOrgName("Legal department");
        OrganizationDao.addOrganization(o);

        o.setParentId(OrganizationDao.getOrganizationByName("DreamTech headquarter").getId());
        o.setOrgSn("market");
        o.setOrgName("Market department");
        OrganizationDao.addOrganization(o);

        o.setParentId(OrganizationDao.getOrganizationByName("DreamTech headquarter").getId());
        o.setOrgSn("financial");
        o.setOrgName("Financial department");
        OrganizationDao.addOrganization(o);*/
    }

    @Test
    public void testGetOrganizations() {
        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
        params.add(SqlHelper.wrapCondition("ORG_SN", "LIKE", "'%ORG_1%'"));
        params.add(SqlHelper.wrapCondition("ORG_NAME", "LIKE", "'%ORG_1%'"));
        List<Organization> orgs = OrganizationDao.getOrganizations(params);
        for (Organization o : orgs) {
            System.out.println(o.toString());
        }
    }
}