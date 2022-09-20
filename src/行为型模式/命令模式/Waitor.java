package org.example.行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

//服务员类 调用者角色
public class Waitor {
    private List<Command> Commands = new ArrayList<Command>();
    public void setCommand(Command cmd) {
        Commands.add(cmd);

    }

    public void orderUp() {
        System.out.println("服务员: 新的订单来了");

        for(Command command : Commands ) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
