package com.ktw.designpatterns.singleton;

/**
 * Created by kevin on 14-12-4.
 * 懒汉模式
 */
public class Singleton2 {
    //    1、将构造方法私有化，不允许外过直接创建对象
    private Singleton2() {
    }

    //声明类的惟一实例
    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
