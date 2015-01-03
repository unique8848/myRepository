package com.ktw.designpatterns.proxy;

import java.util.Random;

/**
 * Created by kevin on 14-11-28.
 */
public class Car implements Moveable {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
