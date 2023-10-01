package com.designpatterns.creational.abstractfactory.factories;

import com.designpatterns.creational.abstractfactory.Shape;
import com.designpatterns.creational.abstractfactory.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("ROUNDED")) {
            return new RoundedSquare();
        }
        return null;
    }
}
