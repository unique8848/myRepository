package com.ktw.pattern.strategy;

import com.ktw.pattern.strategy.impl.FlyWithWing;
import com.ktw.pattern.strategy.impl.QuackWithGa;

/**
 * Created by Kevin on 2014/11/3.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWing());
        super.setQuackStrategy(new QuackWithGa());
    }

    @Override
    public void display() {
        System.out.println("我是头是红色的");
    }
}
