package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.meal.Meal;

public class BuilderMain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("=== Veg Meal ===");
        vegMeal.showItems();
        System.out.println("Cost : $" + vegMeal.getCost());

        System.out.println("=== Non Veg Meal ===");
        nonVegMeal.showItems();
        System.out.println("Cost : $" + nonVegMeal.getCost());
    }
}
