package 建造者模式;


// 具体建造者 摩拜单车
public class MobaiBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");

    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅");

    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
