package org.example.行为型模式.访问者模式;

//抽象访问者角色接口
public interface Person {
    void feed(Cat cat);
    void feed(Dog dog);


}
