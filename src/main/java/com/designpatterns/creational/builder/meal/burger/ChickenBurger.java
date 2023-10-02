package com.designpatterns.creational.builder.meal.burger;

import com.designpatterns.creational.builder.meal.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 20;
    }
}
