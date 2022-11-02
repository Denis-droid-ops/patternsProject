package com.kuznecov.patterns.creational.easybuilder;

public class CarBuilderImpl implements CarBuilder{
    Car car = new Car();
    @Override
    public CarBuilder setName(String name) {
        car.setName(name);
        return this;
    }

    @Override
    public CarBuilder setMilleage(int milleage) {
        car.setMilleage(milleage);
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        car.setYear(year);
        return this;
    }

    public Car build(){
        return car;
    }
}
