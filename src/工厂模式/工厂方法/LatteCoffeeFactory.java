package 工厂模式.工厂方法;

//拿铁咖啡工厂
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
