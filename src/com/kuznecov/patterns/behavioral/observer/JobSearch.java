package com.kuznecov.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args){
        JobSite jobSite = new JobSite();
        Worker worker = new Worker("Jane");
        Worker worker1 = new Worker("Jimmy");
        Worker worker2 = new Worker("Denis");
        jobSite.addObserver(worker);
        jobSite.addObserver(worker1);
        jobSite.addObserver(worker2);
        jobSite.addVacancies("Programmer");
        jobSite.addVacancies("Loader");
        jobSite.addVacancies("Teacher");
        jobSite.addVacancies("Postman");
        jobSite.removeVacancies("Postman");

    }
}
