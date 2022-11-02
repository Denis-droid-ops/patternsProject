package com.kuznecov.patterns.creational.factory1;

public class F1CarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new F1Car();
    }
}
