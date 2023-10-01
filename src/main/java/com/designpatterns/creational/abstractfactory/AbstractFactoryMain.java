package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.factories.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory = factoryProducer.getFactory(true);
        Shape shape = abstractFactory.getShape("Rounded");
        shape.draw();
        abstractFactory = factoryProducer.getFactory(false);
        shape = abstractFactory.getShape("Square");
        shape.draw();
    }
}
