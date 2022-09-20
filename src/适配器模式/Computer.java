package 适配器模式;

public class Computer {
    public String readSD(SDCard sdCard) {
        if(sdCard==null) {
            throw new NullPointerException("sd卡不能为空");

        }
        return sdCard.readSD();
    }
}
