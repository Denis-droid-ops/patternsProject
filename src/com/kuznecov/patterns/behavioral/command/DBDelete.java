package com.kuznecov.patterns.behavioral.command;

public class DBDelete implements Command{ //ConcreteCommand
    Database database;

    public DBDelete(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
       database.delete();
    }
}
