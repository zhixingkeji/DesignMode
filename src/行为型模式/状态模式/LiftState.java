package org.example.行为型模式.状态模式;

//抽象状态类
public abstract class LiftState {
    //环境角色
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    //
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
