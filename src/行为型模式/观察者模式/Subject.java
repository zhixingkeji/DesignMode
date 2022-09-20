package org.example.行为型模式.观察者模式;

//抽象主题角色类
public interface Subject {
    //添加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知
    void notify(String message);

}
