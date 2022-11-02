package com.kuznecov.patterns.structural.facade;

public class CarFacade {
    Engine engine = new Engine();
    Car car = new Car();
    Way way = new Way();
    void navigate(){
        engine.run();
        car.start();
        way.navigate(car);
        car.stop();
        way.navigate(car);
    }
}
