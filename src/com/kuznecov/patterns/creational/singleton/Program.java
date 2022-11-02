package com.kuznecov.patterns.creational.singleton;

public class Program {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton2.equals(singleton3));
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
