package 建造者模式;

//创建复杂对象
// 优点 稳定 容易拓展
public class Client {
    public static void main(String[] args) {
        //创建指挥者
        Director director = new Director(new MobaiBuilder());

        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
