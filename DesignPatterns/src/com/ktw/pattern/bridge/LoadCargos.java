package com.ktw.pattern.bridge;

/**
 * Created by Kevin on 2014/11/6.
 */
public class LoadCargos implements Load {
    @Override
    public void load() {
        System.out.println("The car loads a lot of cargos!");
    }
}
