package com.ktw.pattern.strategy;

import com.ktw.pattern.strategy.impl.FlyNoWay;
import com.ktw.pattern.strategy.impl.QuackNoWay;

/**
 * Created by Kevin on 2014/11/3.
 */
public class BigYellowDuck extends Duck {
    public BigYellowDuck(){
        super();
        super.setFlyingStrategy(new FlyNoWay());
        super.setQuackStrategy(new QuackNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }
}
