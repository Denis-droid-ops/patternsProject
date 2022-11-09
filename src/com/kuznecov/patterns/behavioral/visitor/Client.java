package com.kuznecov.patterns.behavioral.visitor;

import java.util.Arrays;

public class Client {
    public static void main(String[] args){
        Element db = new Database();
        Element test = new Test();
        Visitor javaDeveloper = new JavaDeveloper();
        Visitor cppDeveloper = new CPPDeveloper();
        Project project = new Project(new Element[]{db,test});
        project.accept(javaDeveloper);
        project.accept(cppDeveloper);

    }
}
