package 工厂模式.抽象工厂;


//
public interface DessertFactory {

    //生产咖啡
    Coffee createCoffee();

    //生产甜品
    Dessert createDessert();


}
