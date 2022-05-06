package com.pluralsight.visitor;

import java.util.ArrayList;
import java.util.List;

public class FruitPartitioner implements FruitVisitor{
    private List<Orange> oranges;
    private List<Apple> apples;
    private List<Banana> bananas;

    public FruitPartitioner() {
        this.oranges = new ArrayList<>();
        this.apples = new ArrayList<>();
        this.bananas = new ArrayList<>();
    }


    @Override
    public void visit(Apple fruit) {
        apples.add(fruit);
    }

    @Override
    public void visit(Banana fruit) {
        bananas.add(fruit);
    }

    @Override
    public void visit(Orange fruit) {
        oranges.add(fruit);
    }

    public List<Apple> getApples() {
        return apples;
    }

    public List<Banana> getBananas() {
        return bananas;
    }

    public List<Orange> getOranges() {
        return oranges;
    }
}
