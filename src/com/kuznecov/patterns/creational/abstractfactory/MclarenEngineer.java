package com.kuznecov.patterns.creational.abstractfactory;

public class MclarenEngineer implements Engineer{
    @Override
    public void speak() {
        System.out.println("Lando, are you okay? Copy");
    }
}
