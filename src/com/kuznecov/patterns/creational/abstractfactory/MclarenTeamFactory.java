package com.kuznecov.patterns.creational.abstractfactory;

public class MclarenTeamFactory implements F1TeamFactory{
    @Override
    public Driver createDriver() {
        return new MclarenDriver();
    }

    @Override
    public Engineer createEngineer() {
        return new MclarenEngineer();
    }

    @Override
    public Mechanic createMechanic() {
        return new MclarenMechanic();
    }
}
