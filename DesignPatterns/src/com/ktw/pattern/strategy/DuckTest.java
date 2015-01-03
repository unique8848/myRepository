package com.ktw.pattern.strategy;

/**
 * Created by Kevin on 2014/11/3.
 */
public class DuckTest {
    public static void main(String[] args) {
        System.out.println("测试鸭子程序");

        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.quack();
        duck1.fly();

        Duck duck2 = new RedHeadDuck();
        duck2.display();
        duck2.quack();
        duck2.fly();

        Duck duck3 = new RubberDuck();
        duck3.display();
        duck3.quack();
        duck3.fly();

        Duck duck4 = new BigYellowDuck();
        duck4.display();
        duck4.quack();
        duck4.fly();

        Duck duck5 = new SpaceDuck();
        duck5.display();
        duck5.quack();
        duck5.fly();

        System.out.println("测试完毕");
    }
}
