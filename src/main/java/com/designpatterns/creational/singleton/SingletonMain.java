package com.designpatterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log();
        Logger logger1 = Logger.getLogger();
        logger.log();

        System.out.println(logger.hashCode());
        System.out.println(logger1.hashCode());
    }
}
