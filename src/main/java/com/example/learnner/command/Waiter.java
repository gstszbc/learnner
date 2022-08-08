package com.example.learnner.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/8/8
 */
public class Waiter {
    //持有命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void orderUp() {
        System.out.println("订单来了");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
