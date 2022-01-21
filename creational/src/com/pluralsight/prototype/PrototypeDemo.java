package com.pluralsight.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        // Example 1
        String sql = "select * from movies where title in (?)";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star Wars");

        Record record = new Record();

        Statement statement1 = new Statement(sql, parameters, record);
        System.out.println(statement1.getSql());
        System.out.println(statement1.getParameters());
        System.out.println(statement1.getRecord());

        Statement statement2 = statement1.clone();
        System.out.println(statement2.getSql());
        System.out.println(statement2.getParameters());
        System.out.println(statement2.getRecord());         // Same reference is returned (Shallow Copy)

        // Example 2
        Registry registry = new Registry();
        Movie movie1 = (Movie) registry.createItem("Movie");
        movie1.setTitle("Star Wars");

        System.out.println(movie1);
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getRunTime());
        System.out.println(movie1.getUrl());

        Movie movie2 = (Movie) registry.createItem("Movie");
        movie2.setTitle("Jurassic Park");

        System.out.println(movie2);
        System.out.println(movie2.getTitle());
        System.out.println(movie2.getRunTime());
        System.out.println(movie2.getUrl());

    }
}
