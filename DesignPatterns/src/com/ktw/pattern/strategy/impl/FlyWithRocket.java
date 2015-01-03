package com.ktw.pattern.strategy.impl;

import com.ktw.pattern.strategy.FlyingStrategy;

/**
 * Created by Kevin on 2014/11/4.
 */
public class FlyWithRocket implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("用火箭飞行！");
    }
}
