package com.kuznecov.patterns.behavioral.memento;

public class File {// Caretaker
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
