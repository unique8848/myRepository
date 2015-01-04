package com.ktw.kf.test;


import com.ktw.kf.dao.FunctionDao;
import com.ktw.kf.model.Function;
import com.ktw.kf.util.SqlHelper;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FunctionDaoTest extends TestCase {

    @Test
    public void testAddFunction() throws Exception {
        /*Function f = new Function();
        f.setParentId(0);
        f.setFuncNo("SYS_MGMT");
        f.setFuncName("System management");
        f.setFuncSn(10);
        FunctionDao.addFunction(f);

        f.setParentId(0);
        f.setFuncNo("PORTFOLIO");
        f.setFuncName("Portfolio management");
        f.setFuncSn(20);
        FunctionDao.addFunction(f);

        f.setParentId(0);
        f.setFuncNo("PRO_MGMT");
        f.setFuncName("Project management");
        f.setFuncSn(30);
        FunctionDao.addFunction(f);

        f.setParentId(0);
        f.setFuncNo("CONTRACT");
        f.setFuncName("Contract management");
        f.setFuncSn(40);
        FunctionDao.addFunction(f);

        f.setParentId(0);
        f.setFuncNo("STOCK_MGMT");
        f.setFuncName("Stock management");
        f.setFuncSn(50);
        FunctionDao.addFunction(f);

        f.setParentId(0);
        f.setFuncNo("PAYBACK");
        f.setFuncName("Payback management");
        f.setFuncSn(60);
        FunctionDao.addFunction(f);

        f.setParentId(0);
        f.setFuncNo("COMM_MGMT");
        f.setFuncName("Communication management");
        f.setFuncSn(70);
        FunctionDao.addFunction(f);*/
    }

    @Test
    public void testDeleteFunctionById() throws Exception {
        FunctionDao.deleteFunctionById(30);
    }

    @Test
    public void testGetFunctions() {
        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
        params.add(SqlHelper.wrapCondition("FUNC_NO", "LIKE", "'%M%'"));
//        params.add(SqlHelper.wrapCondition("FUNC_DESC", "LIKE", "'This function is designed to%'"));
        List<Function> funcs = FunctionDao.getFunctions(params);
        for (Function f : funcs) {
            System.out.println(f.toString());
        }
    }
}