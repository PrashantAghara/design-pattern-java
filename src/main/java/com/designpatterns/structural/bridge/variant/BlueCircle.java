package com.designpatterns.structural.bridge.variant;

import com.designpatterns.structural.bridge.DrawAPI;

public class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
