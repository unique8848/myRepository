package com.ktw.pattern.strategy;

import com.ktw.pattern.strategy.impl.FlyWithRocket;
import com.ktw.pattern.strategy.impl.QuackWithGa;
import com.ktw.pattern.strategy.impl.QuackWithRadio;

/**
 * Created by Kevin on 2014/11/4.
 */
public class SpaceDuck extends Duck {
    public SpaceDuck() {
        super();
        super.setFlyingStrategy(new FlyWithRocket());
        super.setQuackStrategy(new QuackWithRadio());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔！");
    }
}
