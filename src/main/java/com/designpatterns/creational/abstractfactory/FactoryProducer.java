package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.factories.AbstractFactory;
import com.designpatterns.creational.abstractfactory.factories.RoundedShapeFactory;
import com.designpatterns.creational.abstractfactory.factories.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
