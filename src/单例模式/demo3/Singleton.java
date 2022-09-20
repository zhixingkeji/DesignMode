package 单例模式.demo3;


// 单例模式 懒汉式 双重检查锁实现 (推荐)
// 因为大部分都是读操作 没必要加上同步锁



public class Singleton {

    //私有构造方法
    private Singleton() {

    }

    //声明变量

    //在多线程模式下 jvm的指令重排序 使得用该方法可能会有空指针异常
    //通过加上 volatile 关键字保证有序
    private static volatile Singleton instance ;

    //对外提供访问方式 不在方法上加锁了
    public static Singleton getInstance() {
        //判断是否为空
        if(instance == null ) {

            synchronized (Singleton.class) {

                if(instance == null ) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }







}
