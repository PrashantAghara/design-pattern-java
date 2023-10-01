package com.designpatterns.creational.abstractfactory.shapes;

import com.designpatterns.creational.abstractfactory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rounded Square");
    }
}
