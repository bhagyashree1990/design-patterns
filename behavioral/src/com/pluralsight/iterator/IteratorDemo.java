package com.pluralsight.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");
        System.out.println("Names: "+names.size());
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            namesIterator.remove();
        }
        System.out.println("Names: "+names.size());

//        for (String name: names) {
//            System.out.println(name);
//        }
    }
}
