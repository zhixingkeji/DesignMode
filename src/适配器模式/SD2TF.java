package 适配器模式;

// 适配器类
public class SD2TF  implements SDCard{

    private TFCard tfcard;

    public SD2TF(TFCard tfcard) {
        this.tfcard = tfcard;
    }

    @Override
    public String readSD() {
        System.out.println("sd适配tf读取");
        return tfcard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd适配tf写入");
        tfcard.writeTF(msg);
    }
}
