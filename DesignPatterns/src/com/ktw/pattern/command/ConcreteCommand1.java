package com.ktw.pattern.command;

/**
 * Created by Kevin on 2014/11/4.
 */
public class ConcreteCommand1 implements Command {
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doIt();
    }
}
