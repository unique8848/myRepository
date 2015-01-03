package com.ktw.pattern.strategy;

/**
 * Created by Kevin on 2014/11/3.
 */
public abstract class Duck {
    private FlyingStrategy flyingStrategy;
    private QuackStrategy quackStrategy;

    public void quack() {
        quackStrategy.performQuack();
    }

    public abstract void display();

    public FlyingStrategy getFlyingStrategy() {
        return flyingStrategy;
    }

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly() {
        flyingStrategy.performFly();
    }

    public QuackStrategy getQuackStrategy() {
        return quackStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }
}
