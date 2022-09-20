package org.example.行为型模式.观察者模式;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

// 具体主题角色类
public class SubscriptSubject implements Subject{

    //储存观察者对象
    private List<Observer> weixinUserList = new ArrayList<Observer>() ;


    //新增
    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    //删除
    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    //通知
    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.updata(message);
        }
    }
}
