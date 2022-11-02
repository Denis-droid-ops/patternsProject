package com.kuznecov.patterns.structural.adapter;

public class MicroSDAdapterToSD extends Sd implements MicroSd{
    @Override
    public void readMicroSd() {
        read();
    }

    @Override
    public void writeMicroSd() {
       write();
    }
}
