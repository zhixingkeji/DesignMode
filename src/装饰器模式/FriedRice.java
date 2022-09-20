package 装饰器模式;

// 具体构建角色 炒饭
public class FriedRice extends FastFood{
    public FriedRice(){
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
