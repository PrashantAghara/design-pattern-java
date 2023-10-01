package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.shapes.Circle;
import com.designpatterns.creational.factory.shapes.Square;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
