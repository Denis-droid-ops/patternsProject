package com.kuznecov.patterns.behavioral.state;

public class Client {
    public static void main(String[] args){
        RadioReceiver radioReceiver = new RadioReceiver();
        Radio radio = new Avtoradio();
        Radio radio1 = new DFM();
        radioReceiver.setRadio(radio);
        radioReceiver.playStation();
        radioReceiver.nextStation();
        radioReceiver.playStation();
    }
}
