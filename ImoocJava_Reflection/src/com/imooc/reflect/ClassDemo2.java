package com.imooc.reflect;

/**
 * Created by Kevin on 2014/10/28.
 */
public class ClassDemo2 {
    public static void main(String[] args){
        Class c1 = int.class;//int的类类型
        Class c2 = String.class;//String的类类型 String类字节码。
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = void.class;//void关键字，都存在类类型。

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());//不包含包名的类的名称
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        System.out.println(c5.getName());
    }
}
