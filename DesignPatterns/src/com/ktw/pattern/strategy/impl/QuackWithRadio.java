package com.ktw.pattern.strategy.impl;

import com.ktw.pattern.strategy.QuackStrategy;

/**
 * Created by Kevin on 2014/11/4.
 */
public class QuackWithRadio implements QuackStrategy {
    @Override
    public void performQuack() {
        System.out.println("我通过无线电与你沟通！");
    }
}
