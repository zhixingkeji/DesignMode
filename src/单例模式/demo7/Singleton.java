package 单例模式.demo7;



//demo7 演示反射破坏单例模式


public class Singleton {

    //静态变量所有线程共享
    private static boolean flag = false;

    private Singleton(){

        synchronized (Singleton.class) {

            //判断flag是否为true
            if(flag) {
                throw new RuntimeException("不能创建多个对象");
            }

            flag = true;
        }
    };

    //静态内部类的例子
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();

    }


    //
    public static Singleton getInstance(){
        return Singleton.SingletonHolder.INSTANCE;
    }



}


