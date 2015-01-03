package com.ktw.kf.util;

import java.util.HashMap;
import java.util.List;
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

    public static String unWrapConditions(StringBuilder sbSql, List<Map<String, Object>> params) {
        if (null != params && params.size() > 0) {
            for (Map<String, Object> param : params) {
                sbSql.append(" AND " + param.get("NAME") + " " + param.get("RELA") + " " + param.get("VALUE"));
            }
        }
        return sbSql.toString();
    }
}
