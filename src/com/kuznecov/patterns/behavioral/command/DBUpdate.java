package com.kuznecov.patterns.behavioral.command;

public class DBUpdate implements Command{
    Database database;

    public DBUpdate(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
