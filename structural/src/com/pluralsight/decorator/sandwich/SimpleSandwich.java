package com.pluralsight.decorator.sandwich;

public class SimpleSandwich implements Sandwich{
    @Override
    public String make() {
        return "Bread ";
    }
}
