package 装饰器模式;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();

        System.out.println(food.getDesc());
        System.out.println(food.cost());
        System.out.println("========");

        // 添加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc());
        System.out.println(food.cost());
        System.out.println("========");

        //再添加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc());
        System.out.println(food.cost());
        System.out.println("========");


        //再添加一个培根
        food = new Bacon(food);
        System.out.println(food.getDesc());
        System.out.println(food.cost());
        System.out.println("========");



    }
}
