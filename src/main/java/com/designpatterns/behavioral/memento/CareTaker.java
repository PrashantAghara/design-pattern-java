package com.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
