package com.ktw.pattern.template;

/**
 * Created by Kevin on 2014/11/4.
 */
public abstract class RefreshBeverage {
    public final void prepareBeverageTemplate() {
        boilWater();
        brew();
        pourIntoCup();
        if (isCustomerWantsCondiments())
            addCondiments();
    }

    /*
    *Hook， 钩子函数，提供一个默认或空的实现
    * 具体的子类可以自行决定是否挂钩以及如何挂钩
    * 询问用户是否加入调料
    */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    //抽象基本方法，泡
    protected abstract void brew();

    private void pourIntoCup() {
        System.out.println("将饮料倒入杯中");
    }

    //抽象基本方法，添加调料
    protected abstract void addCondiments();
}
