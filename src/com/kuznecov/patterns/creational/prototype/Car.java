package com.kuznecov.patterns.creational.prototype;

public class Car implements Copyable{
    private int races = 43;
    private String model = "Mercedes";

    public int getRaces() {
        return races;
    }

    public void setRaces(int races) {
        this.races = races;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Object copy() {
        return new Car();
    }
}
