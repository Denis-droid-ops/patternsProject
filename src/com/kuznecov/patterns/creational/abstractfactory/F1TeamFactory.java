package com.kuznecov.patterns.creational.abstractfactory;

public interface F1TeamFactory {
    public Driver createDriver();
    public Engineer createEngineer();
    public Mechanic createMechanic();
}
