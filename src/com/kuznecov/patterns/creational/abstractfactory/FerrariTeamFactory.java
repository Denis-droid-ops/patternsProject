package com.kuznecov.patterns.creational.abstractfactory;

public class FerrariTeamFactory implements F1TeamFactory{
    @Override
    public Driver createDriver() {
        return new FerrariDriver();
    }

    @Override
    public Engineer createEngineer() {
        return new FerrariEngineer();
    }

    @Override
    public Mechanic createMechanic() {
        return new FerrariMechanic();
    }
}
