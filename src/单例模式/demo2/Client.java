package 单例模式.demo2;


public class Client {

    public static void main(String[] args) {

        //获取两次饿汉式对象
        Slob instance = Slob.getInstance();
        Slob instance1 = Slob.getInstance();

        //判断是否相同 同一个内存地址 也是同一个对象
        System.out.println(instance  == instance1);


    }
}

