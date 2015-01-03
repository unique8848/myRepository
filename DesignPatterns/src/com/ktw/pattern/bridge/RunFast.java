package com.ktw.pattern.bridge;

/**
 * Created by Kevin on 2014/11/6.
 */
public class RunFast implements Run {
    @Override
    public void run() {
        System.out.println("The car is running fast!");
    }
}
