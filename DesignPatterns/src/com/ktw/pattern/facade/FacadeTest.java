package com.ktw.pattern.facade;

/**
 * Created by Kevin on 2014/11/6.
 */
public class FacadeTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.startup();
        c.shutdown();
    }
}
