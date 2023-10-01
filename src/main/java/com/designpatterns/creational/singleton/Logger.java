package com.designpatterns.creational.singleton;

public class Logger {
    private static Logger logger = new Logger();

    public static Logger getLogger() {
        return logger;
    }

    public void log() {
        System.out.println("Logger Class");
    }
}
