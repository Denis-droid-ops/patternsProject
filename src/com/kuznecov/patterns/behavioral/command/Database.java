package com.kuznecov.patterns.behavioral.command;

public class Database { //receiver
    public void select(){
        System.out.println("SELECT*FROM..");
    }

    public void insert(){
        System.out.println("INSERT INTO..");
    }

    public void update(){
        System.out.println("UPDATE..");
    }

    public void delete(){
        System.out.println("DELETE*FROM..");
    }
}
