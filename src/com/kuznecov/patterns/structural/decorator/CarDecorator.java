package com.kuznecov.patterns.structural.decorator;

public class CarDecorator implements Car{
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void gas() {
        System.out.println("1st gear");
        car.gas();
    }
}
