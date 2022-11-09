package com.kuznecov.patterns.behavioral.mediator;

public class Clent {
    public static void main(String[] args) {
        Admin admin = new Admin("Andrew");
        SimpleUser simpleUser = new SimpleUser("Jack");
        Whatsapp whatsapp = new Whatsapp();
        admin.setChat(whatsapp);
        simpleUser.setChat(whatsapp);
        whatsapp.setAdmin(admin);
        whatsapp.addUser(simpleUser);
        simpleUser.sendMessage("Hello i am cool man!");

    }
}
