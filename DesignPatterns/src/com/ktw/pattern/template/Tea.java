package com.ktw.pattern.template;

/**
 * Created by Kevin on 2014/11/4.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }
}
