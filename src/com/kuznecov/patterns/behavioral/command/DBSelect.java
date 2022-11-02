package com.kuznecov.patterns.behavioral.command;

public class DBSelect implements Command{
    Database database;

    public DBSelect(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
