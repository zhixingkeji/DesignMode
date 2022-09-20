package 工厂模式.简单工厂;


//抽象类
public abstract class Coffee {
    public abstract String getName();

    public void addSuager(){
        System.out.println("加糖");

    }

    public void addMilk(){
        System.out.println("加奶");
    }


}
