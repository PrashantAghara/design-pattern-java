package com.designpatterns.creational.prototype.shape;

import com.designpatterns.creational.prototype.Shape;

public class Circle extends Shape {
    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
