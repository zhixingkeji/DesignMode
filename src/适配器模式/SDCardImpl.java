package 适配器模式;

//
public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        String msg = "读取SD卡";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD卡写入" + msg);
    }
}
