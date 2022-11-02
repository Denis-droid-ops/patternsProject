package com.kuznecov.patterns.structural.bridge;

import java.util.Base64;

public abstract class Car {
    Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    abstract void showDetails();
}
