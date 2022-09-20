package org.example.行为型模式.观察者模式;

//具体观察者角色类
public class WexinUser implements  Observer{
    private String name;

    public WexinUser(String name) {
        this.name = name;
    }

    @Override
    public void updata(String msg) {
        System.out.println(name + "-" + msg);
    }
}
