package com.ktw.kf.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 1/4/15.
 */
public class SqlHelper {
    public static Map<String, Object> wrapCondition(Object colName, Object relation, Object value) {
        Map<String, Object> resultCondition = new HashMap<String, Object>();
        resultCondition.put("NAME", colName);
        resultCondition.put("RELA", relation);
        resultCondition.put("VALUE", value);
        return resultCondition;
    }
}
