package org.example.行为型模式.责任链模式;

//定义
//应用场景
//优缺点
//jdk中的应用


public class Client {
    public static void main(String[] args) {
        // 创建请假条对象
        LeaveRequest request = new LeaveRequest("小明",1,"身体不舒服");

        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置责任链
        groupLeader.setNextHandle(manager);
        manager.setNextHandle(generalManager);

        // 提交申请
        groupLeader.submit(request);

    }
}
