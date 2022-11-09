package com.kuznecov.patterns.behavioral.mediator;

public class SimpleUser implements User{
    String name;
    Chat chat;

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public SimpleUser(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("SimpleUser "+name+" getting message: "+message);
    }
}
