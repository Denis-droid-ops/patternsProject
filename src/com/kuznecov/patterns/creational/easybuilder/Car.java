package com.kuznecov.patterns.creational.easybuilder;

public class Car {
    private String name = "ferrari";
    private int milleage = 12000;
    private String engine = "ford";
    private int year = 1993;

    public void setName(String name) {
        this.name = name;
    }

    public void setMilleage(int milleage) {
        this.milleage = milleage;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getMilleage() {
        return milleage;
    }

    public String getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }
}
