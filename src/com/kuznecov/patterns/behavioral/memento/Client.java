package com.kuznecov.patterns.behavioral.memento;

public class Client {
    public static void main(String[] args){
        Game game = new Game();
        game.set(45,1);
        System.out.println(game);
        File file = new File();
        file.setSave(game.save());
        game.set(56,2);
        System.out.println(game);
        game.load(file.getSave());
        System.out.println(game);

    }
}
