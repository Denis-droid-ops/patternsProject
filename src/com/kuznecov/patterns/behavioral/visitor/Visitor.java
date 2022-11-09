package com.kuznecov.patterns.behavioral.visitor;

public interface Visitor {
    void visit(Database database);
    void visit(Test test);
}
