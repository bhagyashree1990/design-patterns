package com.pluralsight.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of builder pattern. ");
        builder.append("Used to append any value to String. ");
        builder.append(1001);
        System.out.println(builder.toString());
    }
}
