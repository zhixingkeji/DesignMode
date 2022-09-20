package org.example.行为型模式.命令模式;

import java.util.Map;
import java.util.Set;

// 具体命令
public class OrderCommand implements  Command{
    private Chef chef;

    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getOrderTable() + "桌的订单");
        Map<String,Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();

        for (String foodname: keys) {
            chef.makeFood(foodname, foodDir.get(foodname));

        }

        System.out.println(order.getOrderTable() + "桌的饭准备好了");
    }


}
