package 原型模式;

public class Realizetype implements Cloneable  {
    public void realizetype() {
        System.out.println("原型创建完成");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (Realizetype) super.clone();
    }
}
