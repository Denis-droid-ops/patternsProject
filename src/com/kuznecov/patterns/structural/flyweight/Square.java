package com.kuznecov.patterns.structural.flyweight;

public class Square implements Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing square with side = "+side+"coordinates "+x+" "+y);
    }
}
