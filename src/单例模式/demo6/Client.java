package 单例模式.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
    public static void main(String[] args) throws Exception{
        //写入对象
//        writeObject2File();

        //读取两次对象 打印
        readObjectFromFile();
        readObjectFromFile();

    }

    //向文件中写数据(对象)
    public static void readObjectFromFile() throws Exception{
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/wangle/a.txt"));


        //读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);

        //释放资源
        ois.close();

    }



    //从文件中读数据(对象)
    public static void writeObject2File() throws Exception{
        //获取对象
        Singleton instance = Singleton.getInstance();

        //创建对象输出流 /Users/wangle
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/wangle/a.txt"));

        //写对象
        oos.writeObject(instance);

        //释放资源
        oos.close();
    }
}
