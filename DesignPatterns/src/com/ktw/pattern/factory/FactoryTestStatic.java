package com.ktw.pattern.factory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class FactoryTestStatic {
    public static void main(String[] args) {
        Sender sender = SenderFactoryStatic.produceMail();
        sender.send();
    }
}
