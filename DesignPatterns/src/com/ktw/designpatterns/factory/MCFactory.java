package com.ktw.designpatterns.factory;

/**
 * 圣诞系列工厂
 * Created by kevin on 12/21/14.
 */
public class MCFactory implements PersonFactory {
    @Override
    public IBoy getBoy() {
        return new MCBoy();
    }

    @Override
    public IGirl getGirl() {
        return new MCGirl();
    }
}
