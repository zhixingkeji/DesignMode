package org.example.行为型模式.解释器模式;

public class Client {
    public static void main(String[] args) {
         Content content = new Content();

         Variable a = new Variable("a");
         Variable b = new Variable("b");
         Variable c = new Variable("c");
         Variable d = new Variable("d");

         content.assign(a,1);
         content.assign(b,2);
         content.assign(c,3);
         content.assign(d,4);

         AbstractExpression expression = new Minus(a, new Plus( new Minus(b,c),d));
         int result = expression.interpret(content);

        System.out.println(expression + "=" + result);
    }
}
