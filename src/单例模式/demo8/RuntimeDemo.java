package 单例模式.demo8;


import java.io.IOException;
import java.io.InputStream;

//demo8 runtime源码 是单例设计模式
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取 runtime类对象
        Runtime runtime = Runtime.getRuntime();

        //调用exec方法
        Process process = runtime.exec("ifconfig");

        //获取输入流
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];

        //读取数据
        int len = is.read(arr);

        //将字节数组转为字符串输出到控制台
        System.out.println(new String(arr,0,len,"GBK"));

    }
}
