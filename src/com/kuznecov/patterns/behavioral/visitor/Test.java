package com.kuznecov.patterns.behavioral.visitor;

public class Test implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
