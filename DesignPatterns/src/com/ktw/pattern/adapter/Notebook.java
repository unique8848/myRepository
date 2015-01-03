package com.ktw.pattern.adapter;

/**
 * Created by Kevin on 2014/11/4.
 */
public class Notebook {
    private ThreePlugInterface plug;

    public Notebook(ThreePlugInterface plug) {
        this.plug = plug;
    }

    public void charge() {
        plug.powerWithThree();
    }
}
