package 单例模式.demo4;


// 单例模式 懒汉式 静态内部类实现
public class Singleton {
    //私有方法
    private Singleton(){};

    //内部类
    // 在没有锁的情况下 保证了多线程的线程安全
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();

    }

    //对外访问
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
