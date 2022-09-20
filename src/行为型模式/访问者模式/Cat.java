package org.example.行为型模式.访问者模式;

//具体元素角色类
public class Cat implements  Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵喵喵");
    }
}
