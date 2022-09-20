package org.example.行为型模式.命令模式;

public class Client {
    public static void main(String[] args) {
        // 创建第一个订单
        Order order1 = new Order();
        order1.setOrderTable(30);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("小可乐",2);

        // 创建第二个订单
        Order order2 = new Order();
        order2.setOrderTable(44);
        order2.setFood("宫保鸡丁盖饭",1);
        order2.setFood("小雪碧",1);

        //创建厨师对象
        Chef chef = new Chef();

        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(chef, order1);
        OrderCommand cmd2 = new OrderCommand(chef, order2);

        //创建服务员
        Waitor invoke = new Waitor();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);


        //服务员发起调用
        invoke.orderUp();

    }
}
