package 单例模式.demo1;


//单例模式  饿汉式

public class hungry {

    //私有构造方法
    private hungry() {

    }

    //创建本类对象
    private static hungry instance = new hungry();


    //提供外界的访问方法
    public static hungry getInstance() {
        return instance;
    }



}
