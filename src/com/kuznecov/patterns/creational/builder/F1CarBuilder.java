package com.kuznecov.patterns.creational.builder;

public class F1CarBuilder extends CarBuilder{
    @Override
    public void buildName() {
        car.setName("Ferrari");
    }

    @Override
    public void buildMilleage() {
        car.setMilleage(120);
    }

    @Override
    public void buildEngine() {
       car.setEngine("FordV8");
    }

    @Override
    public void buildYear() {
       car.setYear(1993);
    }
}
