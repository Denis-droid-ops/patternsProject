package com.kuznecov.patterns.behavioral.command;

public class Programm { //invoker
    Command select;
    Command insert;
    Command delete;
    Command update;

    public Programm(Command select, Command insert, Command delete, Command update) {
        this.select = select;
        this.insert = insert;
        this.delete = delete;
        this.update = update;
    }

    void selectObject(){
        select.execute();
    }

    void insertObject(){
        insert.execute();
    }
    void deleteObject(){
        delete.execute();
    }
    void updateObject(){
        update.execute();
    }
}
