package com.kuznecov.patterns.structural.bridge;

public class Sedan extends Car{
    public Sedan(Brand brand) {
        super(brand);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        brand.setBrand();
    }
}
