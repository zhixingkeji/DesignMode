package 建造者模式;

// 指挥者
public class Director {
    private Builder builder;

    public Director (Builder builder) {
        this.builder = builder;
    }

    //组装操作
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.creatBike();
    }
}
