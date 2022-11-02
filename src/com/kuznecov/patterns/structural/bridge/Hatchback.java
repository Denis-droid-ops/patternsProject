package com.kuznecov.patterns.structural.bridge;

public class Hatchback extends Car{
    public Hatchback(Brand brand) {
        super(brand);
    }

    @Override
    void showDetails() {
        System.out.println("Hatchback");
        brand.setBrand();
    }
}
