package com.ktw.pattern.command;

/**
 * Created by Kevin on 2014/11/4.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void doIt() {
        command.execute();
    }
}
