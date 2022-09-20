package 单例模式.demo7;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws  Exception{
        //获取字节码对象
        Class clazz = Singleton.class;

        //获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();

        //取消访问检查
        cons.setAccessible(true);

        //创建对象
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();

        System.out.println(s1 == s2 );

    }
}
