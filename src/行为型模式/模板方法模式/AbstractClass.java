package org.example.行为型模式.模板方法模式;

public abstract class AbstractClass {
    public void pourOil() {
        System.out.println("倒油");
    }

    public void hotOil(){
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("炒菜炒啊炒啊");
    }

    //模板方法 烹饪
    public void cook() {
        pourOil();
        hotOil();
        pourVegetable();
        pourSauce();
        fry();
    }

}
