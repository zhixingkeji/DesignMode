package 桥接模式;

//适合两个独立的维度 并且两个维度都进行拓展
//
public class Client {
    public static void main(String[] args) {
        OpratingSystem opratingSystem = new Mac(new AviFIle());
        opratingSystem.play("战狼3");
    }
}
