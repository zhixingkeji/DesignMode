package org.example.行为型模式.解释器模式;

// 变量类
public class Variable extends  AbstractExpression{

    //声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Content content) {
        return content.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
