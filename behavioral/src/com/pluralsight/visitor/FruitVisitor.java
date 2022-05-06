package com.pluralsight.visitor;

public interface FruitVisitor {
    void visit(Apple fruit);
    void visit(Banana fruit);
    void visit(Orange fruit);
}
