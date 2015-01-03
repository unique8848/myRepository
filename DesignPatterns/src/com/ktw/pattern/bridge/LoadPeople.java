package com.ktw.pattern.bridge;

/**
 * Created by Kevin on 2014/11/6.
 */
public class LoadPeople implements Load {
    @Override
    public void load() {
        System.out.println("The car loads with four people!");
    }
}
