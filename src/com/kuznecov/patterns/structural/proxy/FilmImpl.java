package com.kuznecov.patterns.structural.proxy;

public class FilmImpl implements Film{
    String file;

    public FilmImpl(String file) {
        this.file = file;
        load();
    }

    public void load(){
        System.out.println("Film loading...");
    }

    @Override
    public void display() {
        System.out.println("Film displaying");
    }
}
