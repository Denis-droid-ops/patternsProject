package com.kuznecov.patterns.creational.builder;

public class TruckBuilder extends CarBuilder{
    @Override
    public void buildName() {
        car.setName("Scania");
    }

    @Override
    public void buildMilleage() {
        car.setMilleage(122000);
    }

    @Override
    public void buildEngine() {
       car.setEngine("Renault12v");
    }

    @Override
    public void buildYear() {
       car.setYear(1999);
    }
}
