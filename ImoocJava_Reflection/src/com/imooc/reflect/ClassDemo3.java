package com.imooc.reflect;

/**
 * Created by Kevin on 2014/10/28.
 */
public class ClassDemo3 {
    public static void main(String[] args) {
        String s = "Hello";
        ClassUtil.printClassMessage(s);

        Integer n1 = 1;
        ClassUtil.printClassMessage(n1);
    }
}
