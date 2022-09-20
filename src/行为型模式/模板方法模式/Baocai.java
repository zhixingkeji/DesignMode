package org.example.行为型模式.模板方法模式;

//包菜
public class Baocai extends AbstractClass{


    @Override
    public void pourVegetable() {
        System.out.println("下锅的是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("酱料是辣椒");
    }
}
