package org.example.行为型模式.责任链模式;

//抽象处理者类
public abstract class Handle {
    protected final static  int NUM_ONE = 1;
    protected final static  int NUM_THREE = 3;
    protected final static  int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    // 上级领导
    private Handle nextHandle;

    public Handle(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handle(int numStart) {
        this.numStart = numStart;
    }

    public void setNextHandle(Handle nextHandle) {
        this.nextHandle = nextHandle;
    }

    //处理请假条的方法
    protected  abstract  void handleLeave(LeaveRequest leave);

    //提交请求
    public final void submit(LeaveRequest leave) {
        this.handleLeave(leave);
//        System.out.println(leave.getNum());
//        System.out.println(this.numEnd);

        if (this.nextHandle != null && leave.getNum() > this.numEnd) {
            System.out.println("当前审批未通过,正在请求上级领导");
            this.nextHandle.submit(leave);
        }else if(leave.getNum() <= this.numEnd){
            System.out.println("审批通过,流程结束");
        }else {
            System.out.println("当前审批未通过,最高不能超过7天");

        }
    }
}
