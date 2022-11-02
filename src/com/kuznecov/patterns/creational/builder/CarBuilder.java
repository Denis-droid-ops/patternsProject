package com.kuznecov.patterns.creational.builder;

public abstract class CarBuilder {
    Car car;
    void createCar(){
        car = new Car();
    }
    public abstract void buildName();
    public abstract void buildMilleage();
    public abstract void buildEngine();
    public abstract void buildYear();

    Car getCar(){
        return car;
    }
}
