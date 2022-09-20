package 适配器模式;

//适配接口
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}
