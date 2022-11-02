package com.kuznecov.patterns.structural.facade;

public class Way {
    void navigate(Car car){
        if(car.isGas()){
            System.out.println("Через 500 метров поверните направо");
        }else System.out.println("Машина стоит, двигайтесь вперед");
    }
}
