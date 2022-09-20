package org.example.行为型模式.状态模式;

public class OpenState extends LiftState{

    //当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSE_STATE);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
