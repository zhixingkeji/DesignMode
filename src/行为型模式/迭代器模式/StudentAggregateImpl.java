package org.example.行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list =new ArrayList<Student>();


    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
