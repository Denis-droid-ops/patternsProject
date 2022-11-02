package com.kuznecov.patterns.creational.factory1;

public class TruckFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Truck();
    }
}
