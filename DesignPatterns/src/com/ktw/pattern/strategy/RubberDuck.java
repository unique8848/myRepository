package com.ktw.pattern.strategy;

import com.ktw.pattern.strategy.impl.FlyNoWay;
import com.ktw.pattern.strategy.impl.QuackNoWay;

/**
 * Created by Kevin on 2014/11/3.
 */
public class RubberDuck extends Duck {
    public RubberDuck(){
        super();
        super.setFlyingStrategy(new FlyNoWay());
        super.setQuackStrategy(new QuackNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }
}
