package Factory.configFactory;


// 读取配置类的简单工厂 spring也使用了该原理
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }
}
