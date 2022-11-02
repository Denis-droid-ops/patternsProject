package com.kuznecov.patterns.creational.factory;

public class DogAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
