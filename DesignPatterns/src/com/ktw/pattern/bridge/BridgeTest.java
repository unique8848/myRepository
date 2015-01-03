package com.ktw.pattern.bridge;

/**
 * Created by Kevin on 2014/11/6.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Run run1 = new RunFast();
        Load load1 = new LoadCargos();
        Car car1 = new Peugeot307(run1, load1);
        car1.run();
        car1.load();

        Run run2 = new RunDragRace();
        Load load2 = new LoadPeople();
        Car car2 = new FordFocus(run2, load2);
        car2.run();
        car2.load();

        Run run3 = new RunFast();
        Load load3 = new LoadCargos();
        Car car3 = new ChevroletCruze(run3, load3);
        car3.run();
        car3.load();
    }
}
