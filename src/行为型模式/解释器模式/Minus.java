package org.example.行为型模式.解释器模式;

//减法表达式类
public class Minus extends  AbstractExpression{

    private AbstractExpression left;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    private AbstractExpression right;

    @Override
    public int interpret(Content content) {
        return left.interpret(content) - right.interpret(content);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")";

    }
}
