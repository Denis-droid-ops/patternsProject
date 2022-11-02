package com.kuznecov.patterns.behavioral.chainOfResponsibility;

public class SMSLogger implements Logger{
    int priority;
    Logger logger;

    public SMSLogger(int priority) {
        this.priority = priority;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void writeMessage(String message, int level) {
        if(level<=priority){
            write(message);
        }
        if(logger!=null){
            logger.writeMessage(message,level);
        }
    }

    public void write(String message) {
        System.out.println("SMS: "+ message);
    }
}
