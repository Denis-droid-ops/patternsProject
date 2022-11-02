package com.kuznecov.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape{
    private List<Shape> compositeList = new ArrayList<>();

    public void addComponent(Shape shape){
        compositeList.add(shape);
    }

    public void removeComponent(Shape shape){
        compositeList.remove(shape);
    }
    @Override
    public void draw() {
       for (Shape shapes:compositeList){
           shapes.draw();
       }
    }
}
