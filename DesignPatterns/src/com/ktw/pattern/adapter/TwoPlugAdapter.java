package com.ktw.pattern.adapter;

/**
 * Created by Kevin on 2014/11/4.
 */
public class TwoPlugAdapter implements ThreePlugInterface {
    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug two) {
        this.plug = two;
    }

    @Override
    public void powerWithThree() {
        System.out.print("通过转化，");
        plug.powerWithTwo();
    }
}
