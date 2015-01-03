package com.ktw.pattern.command;

/**
 * Created by Kevin on 2014/11/4.
 */
public class AddCommand implements ICommand {
    @Override
    public int execute(int i, int j) {
        return i + j;
    }
}
