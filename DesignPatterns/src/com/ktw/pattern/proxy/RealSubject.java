package com.ktw.pattern.proxy;

/**
 * Created by Kevin on 2014/11/4.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real subject is doing something!");
    }
}
