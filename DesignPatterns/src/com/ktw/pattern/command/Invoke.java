package com.ktw.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2014/11/4.
 */
public class Invoke {
    List<ICommand> commandList = new ArrayList<ICommand>();

    //添加命令
    public void addCommand(ICommand command) {
        commandList.add(command);
    }

    //调用命令
    public void invoke(int i, int j) {
        for (ICommand command : commandList)
            System.out.println(command.execute(i, j));
    }
}
