package org.example.行为型模式.责任链模式;

//董事长类
public class GeneralManager extends Handle{


    protected GeneralManager() {
        super( Handle.NUM_THREE,Handle.NUM_SEVEN);

    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());

        System.out.println("总经理正在审批");
    }
}
