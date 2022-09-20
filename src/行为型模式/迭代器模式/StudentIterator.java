package org.example.行为型模式.迭代器模式;

//抽象迭代器角色接口
public interface StudentIterator {
    boolean hasNext();

    Student next();
}
