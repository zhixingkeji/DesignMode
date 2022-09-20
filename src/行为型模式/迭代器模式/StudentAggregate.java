package org.example.行为型模式.迭代器模式;

//抽象聚合角色接口
public interface StudentAggregate {

    //添加
    void addStudent(Student student);

    //删除
    void removeStudent(Student student);

    //获取迭代器
    StudentIterator getStudentIterator();
}
