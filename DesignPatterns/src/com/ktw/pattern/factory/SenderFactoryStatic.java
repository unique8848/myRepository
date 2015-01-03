package com.ktw.pattern.factory;

/**
 * Created by Kevin on 2014/11/4.
 * 静态工厂模式
 */
public class SenderFactoryStatic {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
