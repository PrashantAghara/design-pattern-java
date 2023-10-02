package com.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape circle = ShapeCache.getShape("Circle");
        Shape square = ShapeCache.getShape("Square");

        System.out.println("=== Circle ===");
        System.out.println(circle.getType());
        System.out.println(circle.getId());
        circle.draw();

        System.out.println("=== Square ===");
        System.out.println(square.getType());
        System.out.println(square.getId());
        square.draw();
    }
}
