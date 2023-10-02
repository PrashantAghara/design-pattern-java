package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.meal.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
