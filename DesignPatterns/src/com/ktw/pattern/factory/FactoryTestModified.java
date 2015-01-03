package com.ktw.pattern.factory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class FactoryTestModified {
    public static void main(String[] args) {
        SenderFactoryModified factory = new SenderFactoryModified();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
