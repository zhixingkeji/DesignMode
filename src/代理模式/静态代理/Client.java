package 代理模式.静态代理;

public class Client {
    public static void main(String[] args) {
        ProxyPoint proxy = new ProxyPoint();
        proxy.sell();
    }
}
