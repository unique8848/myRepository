package com.ktw.designpatterns.factory;

import java.util.Map;

/**
 * 发型工厂
 * Created by Kevin on 12/21/14.
 */
public class HairFactory {
    public IHair getHair(String key) {
        if ("left".equals(key))
            return new LeftHair();
        else if ("right".equals(key))
            return new RightHair();
        return null;
    }

    /**
     * 根据类的名称生产对象
     *
     * @param className
     * @return
     */
    public IHair getHairByClass(String className) {
        try {
            IHair hair = (IHair) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public IHair getHairByClassKey(String key) {
        try {
            Map<String, String> map = new PropertyReader().getProperties();
            IHair hair = (IHair) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
