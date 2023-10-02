package com.designpatterns.creational.builder.meal;

import com.designpatterns.creational.builder.Item;
import com.designpatterns.creational.builder.meal.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
