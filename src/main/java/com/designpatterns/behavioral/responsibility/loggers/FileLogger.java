package com.designpatterns.behavioral.responsibility.loggers;

import com.designpatterns.behavioral.responsibility.AbstractLogger;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("[FILE LOG] - " + message);
    }
}
