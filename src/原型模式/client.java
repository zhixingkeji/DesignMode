package 原型模式;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realType = new Realizetype ();

        Realizetype clone = realType.clone  ();
        System.out.println("原型对象和克隆对象是否是同一个对象");
        System.out.println(realType == clone);

    }
}
