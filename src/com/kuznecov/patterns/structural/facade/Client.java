package com.kuznecov.patterns.structural.facade;



public class Client {
    public static void main(String[] args){
      /* Engine engine = new Engine();
       engine.run();
       Car car = new Car();
       car.start();
       Way way = new Way();
       way.navigate(car);
       car.stop();
       way.navigate(car);*/

       CarFacade carFacade = new CarFacade();
       carFacade.navigate();
    }
}
