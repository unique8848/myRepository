package com.ktw.pattern.singleton;

/**
 * Created by Kevin on 2014/11/4.
 * 单例模式
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝、老婆
 * 饿汉模式
 */
public class Singleton {
    //1. 将构造方法私有化，不允许外部直接创建对象
    private Singleton() {

    }

    //2. 创建类的惟一实例
    private static Singleton instance = new Singleton();

    //3. 提供一个用于获取实例的方法
    public static Singleton getInstance() {
        return instance;
    }
}
