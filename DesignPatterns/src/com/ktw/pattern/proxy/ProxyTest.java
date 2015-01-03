package com.ktw.pattern.proxy;

/**
 * Created by Kevin on 2014/11/4.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
