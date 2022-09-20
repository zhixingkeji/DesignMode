package org.example.行为型模式.访问者模式;

import java.util.ArrayList;
import java.util.List;

//对象结构类
public class Home {
    //
    private List<Animal> nodeList = new ArrayList<Animal>();

    public void add (Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
