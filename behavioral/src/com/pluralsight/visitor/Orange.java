package com.pluralsight.visitor;

public class Orange extends Fruit{
    @Override
    void accept(FruitVisitor visitor) {
        visitor.visit(this);
    }
}
