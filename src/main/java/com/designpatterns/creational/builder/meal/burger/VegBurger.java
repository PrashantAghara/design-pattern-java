package com.designpatterns.creational.builder.meal.burger;

import com.designpatterns.creational.builder.meal.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 10;
    }
}
