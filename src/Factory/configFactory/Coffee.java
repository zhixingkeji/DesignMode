package Factory.configFactory;


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
