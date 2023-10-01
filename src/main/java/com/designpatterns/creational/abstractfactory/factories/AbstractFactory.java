package com.designpatterns.creational.abstractfactory.factories;

import com.designpatterns.creational.abstractfactory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
}
