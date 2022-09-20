package 工厂模式.抽象工厂;


//意大利风味工厂
public class ItalyDessertFactory implements DessertFactory{

    //拿铁咖啡
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }


    //提拉米苏
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
