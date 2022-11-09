package com.kuznecov.patterns.behavioral.templateMethod;

public class F1Car extends Car{
    @Override
    void fuelConsumption(){
        System.out.println("fuel consumption is 40l/100km");
    }
}
