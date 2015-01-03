package com.ktw.pattern.strategy.impl;

import com.ktw.pattern.strategy.FlyingStrategy;

/**
 * Created by Kevin on 2014/11/3.
 */
public class FlyNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }
}
