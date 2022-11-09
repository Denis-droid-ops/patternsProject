package com.kuznecov.patterns.behavioral.state;

public class RadioReceiver {//context
    Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void nextStation(){
        if(radio instanceof DFM){
            setRadio(new Avtoradio());
        }else if(radio instanceof Avtoradio){
            setRadio(new DFM());
        }
    }

    public void playStation(){
        radio.play();
    }
}
