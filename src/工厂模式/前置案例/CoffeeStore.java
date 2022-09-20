package 工厂模式.前置案例;

//咖啡商店
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("am".equals(type)){
            coffee = new AmCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有该咖啡");
        }


        //加配料
        coffee.addMilk();
        coffee.addSuager();
        return coffee;
    }
}
