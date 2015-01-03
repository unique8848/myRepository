package com.ktw.designpatterns.singleton;

/**
 * Created by kevin on 14-12-4.
 */
public class SingletonTest {
    public static void main(String[] args) {
        //饿汉模式

        //懒汉模式
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        if (s3 == s4) {
            System.out.println("s3和s4是同一个实例");
        } else {
            System.out.println("s3和s4不是同一个实例");
        }
    }
}
