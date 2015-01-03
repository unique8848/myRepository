/**
 * Created by Kevin on 2014/10/28.
 */
package com.imooc.reflect;

public class ClassDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Foo foo1 = new Foo();

        //第一种表达方式--->实际在告拆我们，任何一个类都有一个隐含的静态成员变量class
        Class c1 = Foo.class;

        //第二种表达方式，已经知道该类的实例对象，通过getClass方法ss
        Class c2 = foo1.getClass();

        //官网的说法：c1、c2表示了Foo类的类类型（class type）
        //类也是对象，是Class类的对象，这个对象我们称为该类的类类型
        //不管c1 or c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象。
        if (c1 == c2){
            System.out.println("Foo类的类类型相同！");
        }

        //第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("com.imooc.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (c2 == c3){
            System.out.println("Foo类的类类型相同！");
        }

        //我们完全可以通过类类型来创建类的对象-->通过c1 or c2 or c3创建Foo的实例
        try {
            Foo foo = (Foo) c1.newInstance();//前提：需要有无参数的构造方法
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Foo {
    void print() {
        System.out.print("Foooooooo");
    }
}
