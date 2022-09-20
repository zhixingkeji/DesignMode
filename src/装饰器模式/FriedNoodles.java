package 装饰器模式;

//具体构建角色 炒面

public class FriedNoodles extends FastFood{
    public  FriedNoodles(){
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
