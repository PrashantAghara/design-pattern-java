package com.designpatterns.behavioral.memento;

public class MememtoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("STATE 1");
        originator.setState("STATE 2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("STATE 3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("STATE 4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
