package com.kuznecov.patterns.behavioral.observer;

import java.util.List;

public class Worker implements Observer{
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Здравствуйте "+name+ ". Доступные вакансии для вас на данный момент: "+vacancies);
    }
}
