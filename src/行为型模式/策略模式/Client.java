package org.example.行为型模式.策略模式;

// 适用于一个类定义了多种算法, 动态切换一种算法的场景
public class Client {
    public static void main(String[] args) {

        Saleman salemanA = new Saleman(new StrategyA());
        salemanA.salesManShow();

        System.out.println("=======");

        Saleman salemanB = new Saleman(new StrategyB());
        salemanB.salesManShow();

    }
}
