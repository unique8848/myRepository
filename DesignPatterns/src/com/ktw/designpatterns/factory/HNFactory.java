package com.ktw.designpatterns.factory;

/**
 * 新年系列工厂
 * Created by kevin on 12/21/14.
 */
public class HNFactory implements PersonFactory {
    @Override
    public IBoy getBoy() {
        return new HNBoy();
    }

    @Override
    public IGirl getGirl() {
        return new HNGirl();
    }
}
