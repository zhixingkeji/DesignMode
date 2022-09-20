package 工厂模式.前置案例;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("am");
        System.out.println(coffee.getName());
    }
}
