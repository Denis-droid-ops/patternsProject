package com.kuznecov.patterns.behavioral.memento;

public class Game {//Originator
    private int level;
    private int ms;

    public void set(int level,int ms) {
        this.level = level;
        this.ms = ms;
    }

    public Save save(){
        return new Save(level,ms);
    }

    public void load(Save save){
        this.level = save.getLevel();
        this.ms = save.getMs();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", ms=" + ms +
                '}';
    }
}
