package com.designpatterns.creational.prototype.shape;

import com.designpatterns.creational.prototype.Shape;

public class Square extends Shape {
    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
