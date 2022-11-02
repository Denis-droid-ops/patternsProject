package com.kuznecov.patterns.structural.composite;

public class Client {
    public static void main(String[] args){
        Shape shape = new Triangle();
        Shape shape1 = new Square();
        Shape shape2 = new Square();

        Composite composite = new Composite();
        composite.addComponent(shape);
        composite.addComponent(shape1);
        composite.addComponent(shape2);

        composite.draw();
    }
}
