package com.kuznecov.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args){
       ShapeFactory shapeFactory = new ShapeFactory();
       List<Shape> shapes= new ArrayList<>();

       Shape shape1 = shapeFactory.getShape("Square");
       Shape shape2 = shapeFactory.getShape("Circle");
       Shape shape3 = shapeFactory.getShape("Circle");
       Shape shape4 = shapeFactory.getShape("Line");
       Shape shape5 = shapeFactory.getShape("Line");

       shapes.addAll(Arrays.asList(shape1,shape2,shape3,shape4,shape5));

        Random random = new Random();

       for (Shape shape:shapes){
           int x = random.nextInt();
           int y = random.nextInt();
           shape.draw(x,y);
       }
    }
}
