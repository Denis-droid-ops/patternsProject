package com.kuznecov.patterns.creational.prototype;

public class PrototypeApp {
    public static void main(String[] args){
       Car car = new Car();
       Car car1 = (Car) car.copy();
       System.out.println(car.getModel()+car.getRaces());
       System.out.println("=============================");
       System.out.println(car1.getModel()+car1.getRaces());
    }
}
