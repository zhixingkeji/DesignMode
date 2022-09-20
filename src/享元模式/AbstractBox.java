package 享元模式;

// 抽象享元角色
public abstract class AbstractBox {
    //获取图形
    public abstract String getShape();

    // 显示图形和颜色
    public void display(String color ) {
        System.out.println("方块形状:" + getShape() + ",颜色:" + color);

    }

}
