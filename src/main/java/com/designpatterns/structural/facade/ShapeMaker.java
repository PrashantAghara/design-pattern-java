package com.designpatterns.structural.facade;

import com.designpatterns.structural.facade.shapes.Circle;
import com.designpatterns.structural.facade.shapes.Square;

public class ShapeMaker {
    Shape circle;
    Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
