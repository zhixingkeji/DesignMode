package 原型模式;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public void show() {
        System.out.println(stu.getName() + ": " + "同学非常优秀");

    }
    private Student stu;
    public Student getStu() {
        return stu;

    }

    public void setStu(Student stu) {
        this.stu = stu;

    }




    @Override
    public Citation clone() throws CloneNotSupportedException {
//        System.out.println("原型复制成功");
        return (Citation) super.clone();
    }
}
