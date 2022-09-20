package 工厂模式.简单工厂;


public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("am".equals(type)){
            coffee = new AmCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有该咖啡");
        }

        return coffee;

    }
}
