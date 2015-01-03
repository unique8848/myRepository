package com.ktw.pattern.decorator;

/**
 * Created by Kevin on 2014/11/5.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.doSomething();
    }
}
