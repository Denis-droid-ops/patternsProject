package com.kuznecov.patterns.structural.decorator;

public class Client {
   public static void main(String[] args){
      Car car = new CarDecorator(new CarDecoratorSecond(new F1Car()));
      car.gas();
   }
}
