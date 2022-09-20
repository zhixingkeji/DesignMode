package org.example.行为型模式.状态模式;

//环境角色类
public class Context {
    public final static OpenState OPEN_STATE = new OpenState();
    public final static CloseState CLOSE_STATE = new CloseState();
    public final static RunState RUN_STATE = new RunState();
    public final static StopState STOP_STATE = new StopState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState (LiftState liftState){
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }


    public void stop(){
        this.liftState.stop();
    }


    public void run(){
        this.liftState.run();
    }




}
