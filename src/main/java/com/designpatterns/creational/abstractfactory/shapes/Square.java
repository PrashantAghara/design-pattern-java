package com.designpatterns.creational.abstractfactory.shapes;

import com.designpatterns.creational.abstractfactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
