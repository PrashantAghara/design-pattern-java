package com.designpatterns.structural.decorator.shape;

import com.designpatterns.structural.decorator.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Square");
    }
}
