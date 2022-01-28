package com.pluralsight.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {10,25,99};
        List<Integer> list = Arrays.asList(array);

        System.out.println(array);
        System.out.println(list);
    }
}
