package com.designpatterns.structural.facade.shapes;

import com.designpatterns.structural.facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
