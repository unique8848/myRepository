package com.ktw.kcf.test;



import com.ktw.kcf.dao.FunctionDao;
import com.ktw.kcf.model.Function;

import java.util.List;

/**
 * Created by kevin on 1/1/15.
 */
public class test {

    public static void main(String[] args) {
        List<Function> funcs = FunctionDao.getFunctions(null);
        for (Function f : funcs) {
            System.out.println(f.toString());
        }
    }
}
