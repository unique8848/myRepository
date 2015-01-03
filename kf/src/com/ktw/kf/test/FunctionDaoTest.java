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
        for (int i = 1; i <= 10; i++) {
            f.setParentId(0);
            f.setFuncNo("func_" + i);
            f.setFuncName("Function" + i);
            f.setFuncSn(i);
            f.setFuncDesc("This function is designed to populate ktw's framework.");
            FunctionDao.addFunction(f);
        }*/
    }

    @Test
    public void testDeleteFunction() throws Exception {
        FunctionDao.deleteFunction(30);
    }

    @Test
    public void testGetFunctions() {
        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
        params.add(SqlHelper.wrapCondition("FUNC_NO", "=", "'Func_6'"));
        params.add(SqlHelper.wrapCondition("FUNC_DESC", "LIKE", "'This function is designed to%'"));
        List<Function> funcs = FunctionDao.getFunctions(params);
        for (Function f : funcs) {
            System.out.println(f.toString());
        }
    }
}