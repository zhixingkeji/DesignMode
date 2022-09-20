package 工厂模式.工厂方法;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory coffeeFactory = new LatteCoffeeFactory();

        coffeeStore.setFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());

                //插件
    }
}
