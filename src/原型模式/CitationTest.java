package 原型模式;


// 浅克隆版
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();

        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);


        Citation citation2 = citation.clone();


        // 浅克隆 被克隆的对象与原对象完全相同,除了基本类型以外,
        // 被克隆对象的其他引用类型的对象的内存地址与原型相同
        // 即被克隆对象除了基本数据类型 直接引用了原对象的内存地址
        // 修改了被克隆对象身上的引用类型的属性 原对象身上的属性也会改变

        // 深克隆 被克隆对象的所有数据类型都是新的内存地址
        // 修改被克隆对象身上的引用类型的属性时, 原对象不受任何影响
        citation2.getStu().setName("李四");


        citation.show();
        citation2.show();
    }
}
