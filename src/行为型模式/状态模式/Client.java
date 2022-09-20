package org.example.行为型模式.状态模式;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setLiftState(new CloseState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
