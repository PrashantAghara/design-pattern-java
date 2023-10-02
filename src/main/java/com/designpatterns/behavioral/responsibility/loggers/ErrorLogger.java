package com.designpatterns.behavioral.responsibility.loggers;

import com.designpatterns.behavioral.responsibility.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("[ERROR LOG] - " + message);
    }
}
