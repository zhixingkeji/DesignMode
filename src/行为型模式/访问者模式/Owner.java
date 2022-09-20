package org.example.行为型模式.访问者模式;

//具体访问者角色类 自己
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂狗");
    }
}
