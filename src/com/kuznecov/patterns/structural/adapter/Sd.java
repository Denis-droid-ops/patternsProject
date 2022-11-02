package com.kuznecov.patterns.structural.adapter;

public class Sd {
    int memory = 32;
    int speed = 100;

    public void read(){
        System.out.println("Чтение данных SD");
    }

    public void write(){
        System.out.println("Запись данных SD");
    }
}
