package 工厂模式.抽象工厂;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
