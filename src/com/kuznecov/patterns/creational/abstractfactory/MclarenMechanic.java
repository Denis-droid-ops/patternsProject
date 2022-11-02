package com.kuznecov.patterns.creational.abstractfactory;

public class MclarenMechanic implements Mechanic{
    @Override
    public void pit() {
        System.out.println("pit stop is 3 sec");
    }
}
