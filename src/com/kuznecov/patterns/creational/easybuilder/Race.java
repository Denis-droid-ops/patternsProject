package com.kuznecov.patterns.creational.easybuilder;

public class Race {
    public static void main(String[] args){
        Car car = new CarBuilderImpl().setEngine("judd").setMilleage(100000).setName("williams").build();
        System.out.println(car.getEngine()+car.getMilleage()+car.getName()+car.getYear());
    }
}
