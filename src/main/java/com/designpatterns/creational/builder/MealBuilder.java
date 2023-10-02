package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.meal.Meal;
import com.designpatterns.creational.builder.meal.burger.ChickenBurger;
import com.designpatterns.creational.builder.meal.burger.VegBurger;
import com.designpatterns.creational.builder.meal.drink.Cola;
import com.designpatterns.creational.builder.meal.drink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Cola());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Pepsi());
        return meal;
    }
}
