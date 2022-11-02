package com.kuznecov.patterns.structural.bridge;

public class Skoda implements Brand{
    @Override
    public void setBrand() {
        System.out.println("This is skoda");
    }
}
