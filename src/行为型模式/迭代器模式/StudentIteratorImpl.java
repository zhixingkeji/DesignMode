package org.example.行为型模式.迭代器模式;

import java.util.List;

//据图迭代器角色类
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public Student next() {
        Student currentstudent = list.get(position);
        position++;

        return currentstudent;
    }
}
