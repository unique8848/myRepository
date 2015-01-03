package com.ktw.pattern.factory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class SenderFactory {
    public Sender produce(String type) {
        if ("mail".equals(type))
            return new MailSender();
        else if ("sms".equals(type))
            return new SmsSender();
        else {
            System.out.println("Input the right type!");
            return null;
        }
    }
}
