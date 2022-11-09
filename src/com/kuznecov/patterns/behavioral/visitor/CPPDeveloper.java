package com.kuznecov.patterns.behavioral.visitor;

public class CPPDeveloper implements Visitor {
    @Override
    public void visit(Database database) {
        System.out.println("Разработка БД на языке си++");
    }

    @Override
    public void visit(Test test) {
        System.out.println("Тестирование программы на языке си++");
    }
}