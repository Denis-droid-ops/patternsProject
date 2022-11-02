package com.kuznecov.patterns.structural.bridge;

public class Kia implements Brand{
    @Override
    public void setBrand() {
        System.out.println("This is kia");
    }
}
