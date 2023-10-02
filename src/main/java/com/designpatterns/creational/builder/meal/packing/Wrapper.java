package com.designpatterns.creational.builder.meal.packing;

import com.designpatterns.creational.builder.meal.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
