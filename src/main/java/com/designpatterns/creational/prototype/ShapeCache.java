package com.designpatterns.creational.prototype;

import com.designpatterns.creational.prototype.shape.Circle;
import com.designpatterns.creational.prototype.shape.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> hashtable = new Hashtable<>();

    public static Shape getShape(String type) {
        Shape cachedShape = hashtable.get(type.toUpperCase());
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        hashtable.put(circle.getType().toUpperCase(), circle);

        Square square = new Square();
        square.setId(2);
        hashtable.put(square.getType().toUpperCase(), square);
    }
}
