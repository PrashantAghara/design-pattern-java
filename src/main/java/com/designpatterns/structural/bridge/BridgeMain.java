package com.designpatterns.structural.bridge;

import com.designpatterns.structural.bridge.variant.BlueCircle;
import com.designpatterns.structural.bridge.variant.RedCircle;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 20, new RedCircle());
        Shape blueCircle = new Circle(100, 100, 10, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
    }
}
