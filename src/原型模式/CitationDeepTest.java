package 原型模式;

import java.io.*;


//深拷贝版本
public class CitationDeepTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();

        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/wangle/test/a.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/wangle/test/a.txt"));
        Citation citation1 = (Citation) ois.readObject();

        ois.close();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        citation.show();
        citation1.show();
    }

}
