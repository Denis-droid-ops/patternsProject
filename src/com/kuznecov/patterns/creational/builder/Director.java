package com.kuznecov.patterns.creational.builder;

public class Director {
    CarBuilder builder;
    public void setBuilder(CarBuilder builder){
        this.builder=builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildEngine();
        builder.buildMilleage();
        builder.buildName();
        builder.buildYear();
        Car car = builder.getCar();
        return car;
    }

}
