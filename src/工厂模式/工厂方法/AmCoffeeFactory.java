package 工厂模式.工厂方法;

// 美式咖啡工厂对象
public class AmCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmCoffee();
    }
}
