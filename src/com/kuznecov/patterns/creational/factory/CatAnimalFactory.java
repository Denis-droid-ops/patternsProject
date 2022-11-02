package com.kuznecov.patterns.creational.factory;

public class CatAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
