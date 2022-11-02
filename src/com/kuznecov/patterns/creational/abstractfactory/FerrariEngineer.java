package com.kuznecov.patterns.creational.abstractfactory;

public class FerrariEngineer implements Engineer{
    @Override
    public void speak() {
        System.out.println("Forza ferrari, you win Carlos! ");
    }
}
