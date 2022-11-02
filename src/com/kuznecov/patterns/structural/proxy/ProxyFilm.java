package com.kuznecov.patterns.structural.proxy;

public class ProxyFilm implements Film{
    String file;
    Film film;

    public ProxyFilm(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(film==null){
            film = new FilmImpl(file);
        }
        film.display();
    }
}
