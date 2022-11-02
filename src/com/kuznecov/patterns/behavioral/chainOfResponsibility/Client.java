package com.kuznecov.patterns.behavioral.chainOfResponsibility;


public class Client {
    public static void main(String[] args){
       SMSLogger logger1 = new SMSLogger(Level.ERROR);
       FileLogger logger2 = new FileLogger(Level.DEBUG);
       EmailLogger logger3 = new EmailLogger(Level.INFO);
       logger1.setLogger(logger2);
       logger2.setLogger(logger3);

       logger1.writeMessage("все нормально", Level.INFO);
       logger1.writeMessage("все средней паршивости", Level.DEBUG);
       logger1.writeMessage("все ужасно", Level.ERROR);

    }
}
