package com.kuznecov.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observable{
    List<Observer> workers = new ArrayList<>();
    List<String> vacancies = new ArrayList<>();

    public void addVacancies(String vacancie){
        vacancies.add(vacancie);
        notifyObserver();
    }

    public void removeVacancies(String vacancie){
        vacancies.remove(vacancie);
        notifyObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        workers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        workers.remove(observer);
    }

    @Override
    public void notifyObserver() {
       for (Observer observer:workers){
            observer.handleEvent(this.vacancies);
       }
    }
}
