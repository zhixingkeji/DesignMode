package 外观模式;

public class SmartApp {
    private Light light;
    private TV tv;
    private Air air;

    public SmartApp() {
        light = new Light();
        tv = new TV();
        air = new Air();

    }


    public void say(String message) {
        if (message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }
    }

    //一键开启
    private void on() {
        light.on();
        tv.on();
        air.on();
    }


    //一键关闭
    private void off() {
        light.off();
        tv.off();
        air.off();
    }
}
