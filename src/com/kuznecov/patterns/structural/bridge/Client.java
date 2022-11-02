package com.kuznecov.patterns.structural.bridge;

public class Client {
    public static void main(String[] args){
       Brand brand = new Kia();
       Brand brand1 = new Skoda();

       Car car = new Hatchback(brand);
       Car car1 = new Sedan(brand);

       car.showDetails();
       car1.showDetails();
    }
}
