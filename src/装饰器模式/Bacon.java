package 装饰器模式;

// 培根类 具体装饰者角色
public class Bacon extends Garnish{
    public Bacon(FastFood fastfood){
        super(fastfood,5,"培根");
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
