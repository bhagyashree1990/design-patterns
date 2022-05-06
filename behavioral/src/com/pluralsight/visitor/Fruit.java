package com.pluralsight.visitor;

abstract class Fruit {
    abstract void accept(FruitVisitor visitor);
}
