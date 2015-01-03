package com.ktw.pattern.abstractfactory;

/**
 * Created by Kevin on 2014/11/4.
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
