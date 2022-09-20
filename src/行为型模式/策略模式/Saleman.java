package org.example.行为型模式.策略模式;

//环境类 聚合策略类
public class Saleman {
    private Strategy strategy;

    public Saleman(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
