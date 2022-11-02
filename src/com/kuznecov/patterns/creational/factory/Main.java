package com.kuznecov.patterns.creational.factory;

public class Main {

    public static void main(String[] args) {
	   AnimalFactory animalFactory = new DogAnimalFactory();
       Animal animal = animalFactory.createAnimal();
       animal.speak();
    }
}
