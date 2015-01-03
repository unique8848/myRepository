package com.ktw.kf.test;



import com.ktw.kf.dao.FunctionDao;
import com.ktw.kf.model.Function;

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
