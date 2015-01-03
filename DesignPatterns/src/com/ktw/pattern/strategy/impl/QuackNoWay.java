package com.ktw.pattern.strategy.impl;

import com.ktw.pattern.strategy.QuackStrategy;

/**
 * Created by Kevin on 2014/11/3.
 */
public class QuackNoWay implements QuackStrategy {
    @Override
    public void performQuack() {
        System.out.println("俺不会叫！");
    }
}
