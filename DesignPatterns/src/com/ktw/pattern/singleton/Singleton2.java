package com.ktw.pattern.singleton;

/**
 * Created by Kevin on 2014/11/4.
 * 懒汉模式
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null)
            instance = new Singleton2();
        return instance;
    }
}
