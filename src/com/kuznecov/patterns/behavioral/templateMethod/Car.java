package com.kuznecov.patterns.behavioral.templateMethod;

public abstract class Car {
    int maxSpeed;
    String model;

    public void gas(){//template method
        System.out.println("Throtlette 10rpm");
        fuelConsumption();
        System.out.println("Throtlette 200rpm");
    }

    abstract void fuelConsumption();
}
