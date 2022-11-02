package com.kuznecov.patterns.behavioral.interpretator;

public class Client {
    public static void main(String[] args){
        System.out.println(getJavaEEExpression().interpret("Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java,javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Spring");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java,spring);
    }
}
