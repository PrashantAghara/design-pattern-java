package com.designpatterns.creational.factory.shapes;

import com.designpatterns.creational.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
