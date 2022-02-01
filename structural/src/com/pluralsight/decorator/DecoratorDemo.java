package com.pluralsight.decorator;

import com.pluralsight.decorator.sandwich.DressingDecorator;
import com.pluralsight.decorator.sandwich.MeatDecorator;
import com.pluralsight.decorator.sandwich.Sandwich;
import com.pluralsight.decorator.sandwich.SimpleSandwich;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecoratorDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();
        // OutputStream is Decorator
        // FileOutputStream is concrete implementation of Decorator
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));) {
            dataOutputStream.writeChars("text");
        }

        // Modify structure of Sandwich using Decorators
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
