package 享元模式;


// 场景 需要多次重复使用享元对象
// 内部状态 不会随着环境的改变而改变的共享部分
// 外部状态 随环境改变而改变的不可以共享的部分

// 优点 减少内存中的相似的对象的数量, 节约系统的资源, 提高系统性能
// 享元模式 分离内部和外部状态,
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("O");
        box1.display("红色");

        AbstractBox box3 = BoxFactory.getInstance().getShape("L");
        box1.display("蓝色");

        AbstractBox box4 = BoxFactory.getInstance().getShape("I");
        box1.display("绿色");


        System.out.println(box1 == box4);  // 结果为 true
    }
}
