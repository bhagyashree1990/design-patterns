package com.pluralsight.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Runtime runtimeInstance1 = Runtime.getRuntime();
        System.out.println(runtimeInstance1);

        Runtime runtimeInstance2 = Runtime.getRuntime();
        System.out.println(runtimeInstance2);

        if (runtimeInstance1 == runtimeInstance2) {
            System.out.println("Same Instance");
        }
    }
}
