package com.kuznecov.patterns.structural.flyweight;

public class Circle implements Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing circle with radius = "+radius+"coordinates "+x+" "+y);
    }
}
