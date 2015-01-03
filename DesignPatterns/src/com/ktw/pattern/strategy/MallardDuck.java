package com.ktw.pattern.strategy;

import com.ktw.pattern.strategy.impl.FlyWithWing;
import com.ktw.pattern.strategy.impl.QuackWithGa;

/**
 * Created by Kevin on 2014/11/3.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWing());
        super.setQuackStrategy(new QuackWithGa());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
