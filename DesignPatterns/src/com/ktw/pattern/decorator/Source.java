package com.ktw.pattern.decorator;

/**
 * Created by Kevin on 2014/11/5.
 */
public class Source implements Sourceable {
    @Override
    public void doSomething() {
        System.out.println("This is the original way of doing a thing!");
    }
}
