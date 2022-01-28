package com.pluralsight.bridge.shape;

import com.pluralsight.bridge.color.Color;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
