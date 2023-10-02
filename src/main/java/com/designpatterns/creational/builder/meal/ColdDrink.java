package com.designpatterns.creational.builder.meal;

import com.designpatterns.creational.builder.Item;
import com.designpatterns.creational.builder.meal.packing.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 5;
    }
}
