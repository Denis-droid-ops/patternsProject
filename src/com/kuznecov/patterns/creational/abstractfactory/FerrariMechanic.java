package com.kuznecov.patterns.creational.abstractfactory;

public class FerrariMechanic implements Mechanic{
    @Override
    public void pit() {
        System.out.println("pit is 2.5sec");
    }
}
