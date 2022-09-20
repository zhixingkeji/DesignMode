package 装饰器模式;

// 装饰者类 抽象装饰角色
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;

    }

    public Garnish(FastFood fastFood,float price , String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}
