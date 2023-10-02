package com.designpatterns.creational.builder.meal.packing;

import com.designpatterns.creational.builder.meal.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
