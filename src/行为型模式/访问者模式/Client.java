package org.example.行为型模式.访问者模式;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());

        Owner owner = new Owner();
        home.action(owner);

    }
}
