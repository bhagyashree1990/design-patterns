package com.pluralsight.visitor;

public class Banana extends Fruit{
    @Override
    void accept(FruitVisitor visitor) {
        visitor.visit(this);
    }
}
