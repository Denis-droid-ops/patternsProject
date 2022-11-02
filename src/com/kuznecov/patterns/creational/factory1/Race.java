package com.kuznecov.patterns.creational.factory1;

public class Race {
    Truck truck = new Truck();
    F1Car f1Car = new F1Car();

    public static void main(String[] args){
       CarFactory carFactory = new TruckFactory();
       Car car = carFactory.createCar();
       car.gas();
    }
}
