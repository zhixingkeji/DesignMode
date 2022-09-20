package 单例模式.demo6;


//demo6 演示序列化破坏单例模式 静态内部类的例子

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){};

    //静态内部类的例子
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();

    }


    //
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }


    //使用该方法可以解决破坏单例的问题
    //反序列化的时候自动调用该方法
    // readObject底层原理实现 判断是否有该方法 有则调用
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }



}


