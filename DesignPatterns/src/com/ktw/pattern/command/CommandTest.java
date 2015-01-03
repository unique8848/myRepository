package com.ktw.pattern.command;

/**
 * Created by Kevin on 2014/11/4.
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand1(receiver);
        Invoker invoker = new Invoker(command1);
        invoker.doIt();

        Invoke invoke = new Invoke();
        invoke.addCommand(new AddCommand());
        invoke.addCommand(new SubCommand());
        invoke.addCommand(new MulCommand());
        invoke.addCommand(new DivCommand());

        invoke.invoke(3, 4);
    }
}
