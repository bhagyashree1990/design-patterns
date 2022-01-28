package com.pluralsight.bridge;

import com.pluralsight.bridge.color.Blue;
import com.pluralsight.bridge.color.Color;
import com.pluralsight.bridge.color.Red;
import com.pluralsight.bridge.shape.Circle;
import com.pluralsight.bridge.shape.Shape;
import com.pluralsight.bridge.shape.Square;

public class BridgeDemo2 {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape blueSquare = new Square(blue);
        blueSquare.applyColor();

        Color red = new Red();
        Shape redCircle = new Circle(red);
        redCircle.applyColor();

    }
}
