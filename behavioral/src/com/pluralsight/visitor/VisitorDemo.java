package com.pluralsight.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        var fruits =  new Fruit[]{
                new Orange(), new Apple(), new Banana(),
                new Orange(), new Apple(), new Banana(),
                new Apple(), new Banana(), new Apple(),
                new Apple(), new Banana(), new Banana()
        };

        FruitPartitioner partitioner = new FruitPartitioner();
        for (Fruit fruit: fruits) {
            fruit.accept(partitioner);
        }

        System.out.println("Count Apples: "+partitioner.getApples().size());
        System.out.println("Count Bananas: "+partitioner.getBananas().size());
        System.out.println("Count Oranges: "+partitioner.getOranges().size());
    }
}
