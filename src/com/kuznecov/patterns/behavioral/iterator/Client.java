package com.kuznecov.patterns.behavioral.iterator;

public class Client {
    public static void main(String[] args){
        CarCollection carCollection = new CarCollection();
        Iterator iterator = carCollection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
