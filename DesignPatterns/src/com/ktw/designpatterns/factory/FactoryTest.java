package com.ktw.designpatterns.factory;

/**
 * Created by kevin on 12/21/14.
 */
public class FactoryTest {
    public static void main(String[] args) {
        /*IHair left = new LeftHair();
        left.draw();
        IHair right = new RightHair();
        right.draw();*/

        /*HairFactory factory = new HairFactory();
        IHair left = factory.getHair("left");
        left.draw();
        IHair right = factory.getHair("right");
        right.draw();*/

        /*HairFactory factory = new HairFactory();
        IHair hair = factory.getHairByClass("com.ktw.designpatterns.factory.LeftHair");
        hair.draw();*/

        /*HairFactory factory = new HairFactory();
        IHair right = factory.getHairByClassKey("right");
        right.draw();

        IHair middle = factory.getHairByClassKey("middle");
        middle.draw();*/

        PersonFactory factory = new MCFactory();
        IGirl girl = factory.getGirl();
        girl.drawGirl();

        PersonFactory factory1 = new HNFactory();
        IBoy boy = factory1.getBoy();
        boy.drawBoy();
    }
}
