package com.imooc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Kevin on 2014/10/28.
 */
public class ClassUtil {
    /**
     * 打印类的成员信息，包括类的成员函数、成员变量。
     *
     * @param obj 该对象所属类的信息。
     */
    public static void printClassMessage(Object obj) {
        //要获取类的信息，首先要获取类的类类型
        Class c = obj.getClass();//传递的是哪个子类的对象，c就是该子类的类类型
        //获取类的名称
        System.out.println("类的名称是：" + c.getName());
        //Method类，方法对象
        //一个成员方法就是一个Mehod对象。
        //getMethods()方法获取的是所有的public的函数，包括从父类继承而来的
        //Method[] ms = c.getMethods();
        //getDeclaredMethods()获取的是该类自已声明的方法，不问访问权限。
        Method[] ms = c.getDeclaredMethods();
        for (Method m : ms) {
            //得到方法的返回值类型的类类型
            Class returnType = m.getReturnType();
            System.out.print(returnType.getName() + " ");
            //得到方法的名称
            System.out.print(m.getName() + "(");
            //获取参数类型-->得到的是参数列表的类型的类类型
            Class[] paramTypes = m.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + ",");
            }
            System.out.println(")");
            printFieldMessage(c);
        }
    }

    public static void printFieldMessage(Object obj) {
        Class c = obj.getClass();
        /**
         * 成员变量也是对象
         * java.lang.reflect.Field
         *Field类封装了关于成员变量的操作
         * getFields()方法获取的是所有的public的成员变量的信息
         * getDeclaredFields()获取的是该类自已声明的成员变量的信息
         */
        //Field[] fs = c.getFields();
        Field[] fs = c.getDeclaredFields();
        for (Field field : fs) {
            //得到成员变量的类型的类类型
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName + " " + fieldName);
        }
    }

    /**
     * 打印对象的构造函数的信息
     */
    public static void printConMessage(Object obj) {
        Class c = obj.getClass();
        /*
        构造函数也是对象
        java.lang.Constructor中封装了构造函数的信息
        * */
        //Constructor[] cs = c.getConstructors();
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            System.out.print(constructor.getName() + "(");
            //获取构造函数的参数列表-->得到的是参数列表的类类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + ",");
            }
            System.out.println(")");
        }
    }
}
