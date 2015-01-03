package com.ktw.pattern.template;

/**
 * Created by Kevin on 2014/11/4.
 * 具体子类，提供了咖啡类的具体实现
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
