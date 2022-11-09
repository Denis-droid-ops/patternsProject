package com.kuznecov.patterns.behavioral.visitor;

public class Database implements Element{
    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
