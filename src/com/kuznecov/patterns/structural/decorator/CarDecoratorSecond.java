package com.kuznecov.patterns.structural.decorator;

public class CarDecoratorSecond implements Car{
    Car car;

    public CarDecoratorSecond(Car car) {
        this.car = car;
    }

    @Override
    public void gas() {
        car.gas();
        System.out.println("Second gear");
    }
}
