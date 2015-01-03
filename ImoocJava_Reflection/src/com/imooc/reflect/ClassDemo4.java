package com.imooc.reflect;

/**
 * Created by Kevin on 2014/10/29.
 */
public class ClassDemo4 {
    public static void main(String[] args){
        ClassUtil.printFieldMessage("Hello");
        System.out.println("================");
        ClassUtil.printFieldMessage(new Integer(1));
    }
}
