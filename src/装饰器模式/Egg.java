package 装饰器模式;

// 鸡蛋类 具体装饰者角色
public class Egg extends Garnish{
    public Egg(FastFood fastfood){
        super(fastfood,1,"鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc(){
        return super.getDesc() + getFastFood().getDesc();
    }
}
