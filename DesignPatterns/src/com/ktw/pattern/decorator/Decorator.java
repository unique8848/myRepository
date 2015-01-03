package com.ktw.pattern.decorator;

/**
 * Created by Kevin on 2014/11/5.
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void doSomething() {
        System.out.println("Before decorator...");
        source.doSomething();
        System.out.println("After decorator...");
    }
}
