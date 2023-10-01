package com.designpatterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
        shape = shapeFactory.getShape("SquAre");
        shape.draw();
    }
}
