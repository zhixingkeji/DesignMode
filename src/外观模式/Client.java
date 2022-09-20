package 外观模式;

public class Client {

    public static void main(String[] args) {
        SmartApp smartApp = new SmartApp();
        smartApp.say("早上打开家电");

        smartApp.say("晚上关闭家电");
    }
}
