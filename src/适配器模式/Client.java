package 适配器模式;

// 电脑可以直接读取sd卡数据 不能读取tf卡数据
// 使用适配器可以读取tf卡
public class Client {
    public static void main(String[] args) {

        //以下代码为直接读取sd卡
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("==========");

        //以下代码适配读取tf卡
        SD2TF sd2TF = new SD2TF(new TFCardImpl());
        String s = computer.readSD(sd2TF);
        System.out.println(s);
    }
}
