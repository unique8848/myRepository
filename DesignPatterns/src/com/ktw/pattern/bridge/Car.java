package com.ktw.pattern.bridge;

/**
 * Created by Kevin on 2014/11/6.
 */
public abstract class Car {
    private Run run;
    private Load load;

    protected Car(Run run, Load load) {
        this.run = run;
        this.load = load;
    }

    public void run(){
        run.run();
    }
    public void load(){
        load.load();

    }
}
