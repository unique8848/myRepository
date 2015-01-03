package com.ktw.pattern.abstractfactory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
