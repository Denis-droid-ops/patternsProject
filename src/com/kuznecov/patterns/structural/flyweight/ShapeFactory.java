package com.kuznecov.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    Map<String,Shape> shapeMap = new HashMap();

    public Shape getShape(String key){
        Shape shape = shapeMap.get(key);
        if(shape==null){
            switch (key){
                case "Square":shape = new Square(5);
                break;
                case "Circle": shape = new Circle(3);
                break;
                case "Line": shape = new Line(1);
                break;
            }
            shapeMap.put(key,shape);
        }
        return shape;
    }

}
