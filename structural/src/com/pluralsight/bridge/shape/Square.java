package com.pluralsight.bridge.shape;

import com.pluralsight.bridge.color.Color;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
