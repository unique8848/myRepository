package com.ktw.pattern.abstractfactory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is a mail sender!");
    }
}
