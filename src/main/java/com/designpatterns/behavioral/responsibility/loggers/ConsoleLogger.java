package com.designpatterns.behavioral.responsibility.loggers;

import com.designpatterns.behavioral.responsibility.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("[CONSOLE LOG] - " + message);
    }
}
