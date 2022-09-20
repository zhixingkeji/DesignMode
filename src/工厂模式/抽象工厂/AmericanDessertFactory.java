package 工厂模式.抽象工厂;

//美式风味甜品工厂
public class AmericanDessertFactory implements DessertFactory{


    //美式咖啡
    @Override
    public Coffee createCoffee() {
        return new AmCoffee();
    }


    //美式 抹茶慕斯
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
