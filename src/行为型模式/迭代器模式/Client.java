package org.example.行为型模式.迭代器模式;

public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三" , "001"));
        studentAggregate.addStudent(new Student("李四" , "002"));
        studentAggregate.addStudent(new Student("王五" , "003"));
        studentAggregate.addStudent(new Student("赵六" , "004"));


        StudentIterator iterator = studentAggregate.getStudentIterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.toString());
        }




    }
}
