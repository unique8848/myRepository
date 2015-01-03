package com.ktw.pattern.factory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
