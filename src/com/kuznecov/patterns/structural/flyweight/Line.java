package com.kuznecov.patterns.structural.flyweight;

public class Line implements Shape{
    int point;

    public Line(int point) {
        this.point = point;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing line with point = "+point+"coordinates "+x+" "+y);
    }
}
