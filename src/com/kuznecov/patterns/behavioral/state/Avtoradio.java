package com.kuznecov.patterns.behavioral.state;

public class Avtoradio implements Radio{
    int frequency = 101;
    @Override
    public void play() {
        System.out.println("Playing radiostation Avtoradio on"+ frequency+" fm");
    }
}
