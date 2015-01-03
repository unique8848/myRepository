package com.ktw.pattern.command;

/**
 * Created by Kevin on 2014/11/5.
 */
public class ConcreteCommand2 implements Command {
    @Override
    public void execute() {
        System.out.println("Do it another way!");
    }
}
