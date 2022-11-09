package com.kuznecov.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
