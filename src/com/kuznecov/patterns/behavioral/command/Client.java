package com.kuznecov.patterns.behavioral.command;

public class Client {
    public static void main(String[] args){
       Database database = new Database();
       Programm programm = new Programm(new DBSelect(database),new DBInsert(database),new DBDelete(database),new DBUpdate(database));
       programm.selectObject();
       programm.insertObject();
       programm.deleteObject();
       programm.updateObject();
    }
}
