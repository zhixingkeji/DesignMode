package 单例模式.demo1;

//测试类
public class Client {

    public static void main(String[] args) {

        //获取两次饿汉式对象
        hungry instance = hungry.getInstance();
        hungry instance1 = hungry.getInstance();

        //判断是否相同 同一个内存地址 也是同一个对象
        System.out.println(instance  == instance1);


    }
}
