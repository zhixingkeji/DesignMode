package org.example.行为型模式.命令模式;

import java.util.HashMap;
import java.util.Map;

public class Order {
    //餐桌号码
    private int orderTable;

    //下单的餐品和份数
    private Map<String, Integer> foodDir = new HashMap<String, Integer>();

    public int getOrderTable() {
        return orderTable;
    }

    public void setOrderTable(int orderTable) {
        this.orderTable = orderTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
