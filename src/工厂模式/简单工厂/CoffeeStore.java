package 工厂模式.简单工厂;

//import 工厂模式.前置案例.AmCoffee;

//咖啡商店
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);


        //加配料
        coffee.addMilk();
        coffee.addSuager();
        return coffee;
    }
}
