package com.ktw.pattern.template;

/**
 * Created by Kevin on 2014/11/4.
 */
public class RefreshBeverageTest {
    public static void main(String[] args) {
        System.out.println("咖啡制做中");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了");

        System.out.println("\n*******************************");
        System.out.println("制备茶中");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶制备好了");
    }
}
