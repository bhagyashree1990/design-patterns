package com.pluralsight.visitor;

public class Apple extends Fruit{
    @Override
    void accept(FruitVisitor visitor) {
        visitor.visit(this);
    }
}
