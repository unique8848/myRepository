package com.ktw.pattern.adapter;

/**
 * Created by Kevin on 2014/11/5.
 */
public class AdapterTest {
    public static void main(String[] args) {
        GBTwoPlug two = new GBTwoPlug();
        ThreePlugInterface threePlug = new TwoPlugAdapter(two);
        Notebook nb = new Notebook(threePlug);
        nb.charge();

        threePlug = new TwoPlugAdapterExtends();
        nb = new Notebook(threePlug);
        nb.charge();
    }
}
