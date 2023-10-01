package com.designpatterns.creational.abstractfactory.factories;

import com.designpatterns.creational.abstractfactory.Shape;
import com.designpatterns.creational.abstractfactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
