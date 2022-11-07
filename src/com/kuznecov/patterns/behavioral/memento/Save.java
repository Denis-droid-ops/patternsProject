package com.kuznecov.patterns.behavioral.memento;

public class Save {//Memento
    private final int level;
    private final int ms;

    public Save(int level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public int getLevel() {
        return level;
    }

    public int getMs() {
        return ms;
    }
}
