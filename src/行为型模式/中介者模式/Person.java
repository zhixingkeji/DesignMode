package org.example.行为型模式.中介者模式;


//抽象同事类
public abstract class Person {
    protected  String name;
    protected  Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
