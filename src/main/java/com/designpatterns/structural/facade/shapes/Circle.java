package com.designpatterns.structural.facade.shapes;

import com.designpatterns.structural.facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
