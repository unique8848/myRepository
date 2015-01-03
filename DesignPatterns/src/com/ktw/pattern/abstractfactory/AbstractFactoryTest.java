package com.ktw.pattern.abstractfactory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new MailFactory();
        Sender sender = provider.produce();
        sender.send();

        provider = new SmsFactory();
        sender = provider.produce();
        sender.send();
    }
}
