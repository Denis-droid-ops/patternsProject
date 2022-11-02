package com.kuznecov.patterns.structural.decorator;

public class F1Car implements Car{
    @Override
    public void gas() {
        System.out.println("Throtlette 350rpm");
    }
}
