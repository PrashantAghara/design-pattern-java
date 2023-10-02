package com.designpatterns.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("10 + 6 = " + context.executeStrategy(10, 6));
        context = new Context(new Subtract());
        System.out.println("10 - 6 = " + context.executeStrategy(10, 6));
    }
}
