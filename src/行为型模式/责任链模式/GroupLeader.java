package org.example.行为型模式.责任链模式;

import java.util.logging.Handler;

//小组长类
public class GroupLeader extends Handle{


    protected GroupLeader() {
        super(0, Handle.NUM_ONE);

    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());

        System.out.println("小组长正在审批");
    }
}
