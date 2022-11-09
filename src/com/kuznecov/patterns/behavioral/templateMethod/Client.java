package com.kuznecov.patterns.behavioral.templateMethod;

public class Client {
    public static void main(String[] args){
        Car car = new Truck();
        Car car1 = new F1Car();
        car.gas();
        car1.gas();
    }
}
