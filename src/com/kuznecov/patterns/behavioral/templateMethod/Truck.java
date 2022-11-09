package com.kuznecov.patterns.behavioral.templateMethod;

public class Truck extends Car{
    @Override
    void fuelConsumption() {
        System.out.println("fuel consumption is 50l/100km");
    }
}
