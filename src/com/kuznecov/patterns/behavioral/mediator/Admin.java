package com.kuznecov.patterns.behavioral.mediator;

public class Admin implements User{
    String name;
    Chat chat;

    public Admin(String name) {
        this.name = name;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin "+ name+" getting message: "+message);
    }
}
