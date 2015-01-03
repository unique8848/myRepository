package com.ktw.pattern.strategy.impl;

import com.ktw.pattern.strategy.QuackStrategy;

/**
 * Created by Kevin on 2014/11/3.
 */
public class QuackWithGa implements QuackStrategy {
    @Override
    public void performQuack() {
        System.out.println("嘎嘎嘎");
    }
}
