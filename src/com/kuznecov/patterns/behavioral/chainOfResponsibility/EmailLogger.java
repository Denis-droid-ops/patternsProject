package com.kuznecov.patterns.behavioral.chainOfResponsibility;

public class EmailLogger implements Logger{
    int priority;
    Logger logger;

    public EmailLogger(int priority) {
        this.priority = priority;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void writeMessage(String message, int level) { // handleMessage();
        if(level<=priority){
            write(message);
        }
        if(logger!=null){
            logger.writeMessage(message,level);
        }
    }

    public void write(String message) {    // hadlerMethod()
        System.out.println("Email: "+ message);
    }
}
