package com.kuznecov.patterns.behavioral.visitor;

public class Project implements Element{
    Element[] projectElements;

    public Project(Element[] projectElements) {
        this.projectElements = new Element[]{new Database(),new Test()};
    }

    @Override
    public void accept(Visitor visitor) {
       for(Element e:projectElements){
           e.accept(visitor);
       }
    }
}
