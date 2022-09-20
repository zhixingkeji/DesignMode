package 适配器模式;

public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String msg = "读取TF卡";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("写入TF卡" + msg);
    }
}
