package 建造者模式;

// 抽象建造者
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();

    public abstract Bike creatBike();

}