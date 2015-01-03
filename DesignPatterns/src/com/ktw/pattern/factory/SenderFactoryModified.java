package com.ktw.pattern.factory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class SenderFactoryModified {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
