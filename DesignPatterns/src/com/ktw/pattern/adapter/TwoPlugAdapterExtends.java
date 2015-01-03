package com.ktw.pattern.adapter;

/**
 * Created by Kevin on 2014/11/4.
 * 采用继承方式的插座适配器
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugInterface {
    @Override
    public void powerWithThree() {
        System.out.print("借助继承适配器");
        this.powerWithTwo();
    }
}
