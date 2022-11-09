package com.kuznecov.patterns.behavioral.state;

public class DFM implements Radio{
    int frequency = 107;
    @Override
    public void play() {
        System.out.println("Playing radiostation DFM on"+ frequency+" fm");
    }
}
