package com.kuznecov.patterns.structural.proxy;

public class Client {
    public static void main(String[] args){
        Film film = new ProxyFilm("D:/films");
        film.display();
    }
}
