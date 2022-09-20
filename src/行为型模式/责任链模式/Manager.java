package org.example.行为型模式.责任链模式;

//部门经理类
public class Manager extends Handle{


    protected Manager() {
        super( Handle.NUM_ONE,Handle.NUM_THREE);

    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());

        System.out.println("部门经理正在审批");
    }
}
