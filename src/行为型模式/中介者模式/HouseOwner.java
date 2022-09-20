package org.example.行为型模式.中介者模式;

// 具体同事角色类
public class HouseOwner extends  Person{


    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }


    //联系中介
    public void constact(String message) {
        mediator.constact(message, this);

    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("房主" + name + "收到的信息是:" + message);
    }
}
