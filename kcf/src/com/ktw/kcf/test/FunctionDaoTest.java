package com.ktw.kcf.test;


import com.ktw.kcf.dao.FunctionDao;
import com.ktw.kcf.model.Function;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
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

        Map<String, Object> condition1 = new HashMap<String, Object>();
        condition1.put("NAME", "FUNC_NO");
        condition1.put("RELA", "=");
        condition1.put("VALUE", "'Func_6'");
        params.add(condition1);

        Map<String, Object> condition2 = new HashMap<String, Object>();
        condition2.put("NAME", "FUNC_DESC");
        condition2.put("RELA", "LIKE");
        condition2.put("VALUE", "'This function is designed to%'");
        params.add(condition2);

        List<Function> funcs = FunctionDao.getFunctions(params);
        for (Function f : funcs) {
            System.out.println(f.toString());
        }
    }
}