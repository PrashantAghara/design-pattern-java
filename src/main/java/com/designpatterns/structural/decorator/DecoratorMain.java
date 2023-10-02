package com.designpatterns.structural.decorator;

import com.designpatterns.structural.decorator.shape.Circle;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);

        System.out.println("NORMAL CIRCLE");
        circle.draw();
        System.out.println("=======");
        System.out.println("RED CIRCLE");
        redCircle.draw();
    }
}
