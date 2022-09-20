package 工厂模式.工厂方法;


//咖啡商店
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;
    public void setFactory(CoffeeFactory coffeeFactory) {
            this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSuager();
        return coffee;
    }
}
