package com.kuznecov.patterns.behavioral.visitor;

public class JavaDeveloper implements Visitor{
    @Override
    public void visit(Database database) {
        System.out.println("Разработка БД на языке джава");
    }

    @Override
    public void visit(Test test) {
        System.out.println("Тестирование программы на языке джава");
    }
}
