package com.kuznecov.patterns.creational.builder;

public class Race {
    public static void main(String[] args){
        Director director = new Director();
        CarBuilder builder = new F1CarBuilder();
        CarBuilder builder1 = new TruckBuilder();
        director.setBuilder(builder1);
        Car car = director.buildCar();
        System.out.println(car.getEngine()+""+car.getMilleage()+""+car.getName()+""+car.getYear());

    }
}
