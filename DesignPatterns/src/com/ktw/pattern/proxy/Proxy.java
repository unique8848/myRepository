package com.ktw.pattern.proxy;

/**
 * Created by Kevin on 2014/11/4.
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
