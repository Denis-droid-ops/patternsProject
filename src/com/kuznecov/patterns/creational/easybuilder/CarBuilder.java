package com.kuznecov.patterns.creational.easybuilder;

public interface CarBuilder {
    CarBuilder setName(String name);
    CarBuilder setMilleage(int milleage);
    CarBuilder setEngine(String engine);
    CarBuilder setYear(int year);
    Car build();
}
