package com.kuznecov.patterns.structural.facade;

public class Car {
    private boolean gas = false;

    public boolean isGas(){
        return gas;
    }
    public void start(){
        gas = true;
    }
    public void stop(){
        gas = false;
    }


}
