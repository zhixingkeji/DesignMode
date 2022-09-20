package 代理模式.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private TranStation station = new TranStation();

    public SellTickets getProxyObject(){
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取费用");

                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );

        return proxyObject;
    };
}
