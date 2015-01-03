package com.ktw.pattern.strategy.impl;

import com.ktw.pattern.strategy.FlyingStrategy;

/**
 * Created by Kevin on 2014/11/3.
 */
public class FlyWithWing implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
