package org.example.行为型模式.观察者模式;

public class Client {
    public static void main(String[] args) {
        // 创建公众号对象
        SubscriptSubject subscriptSubject = new SubscriptSubject();

        // 订阅公众号
        subscriptSubject.attach(new WexinUser("张三"));
        subscriptSubject.attach(new WexinUser("李四"));
        subscriptSubject.attach(new WexinUser("王五"));
        subscriptSubject.attach(new WexinUser("赵六"));

        //公众号更新
        subscriptSubject.notify("更新了一个内容");

    }
}
