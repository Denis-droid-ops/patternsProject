package com.kuznecov.patterns.behavioral.command;

public class DBInsert implements Command{
    Database database;

    public DBInsert(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
