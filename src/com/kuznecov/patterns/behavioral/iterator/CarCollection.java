package com.kuznecov.patterns.behavioral.iterator;

public class CarCollection implements Collection{
    String[] cars = {"BMW","Mercedes","Ferrari","Bugatti"};
    @Override
    public Iterator getIterator() {
        return new CarIterator();
    }
    class CarIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            if(index<cars.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return cars[index++];
        }
    }
}
