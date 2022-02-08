package com.pluralsight.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {
    public static void main(String[] args) {
        String input = "Lions, and tigers, and bears! Oh, my!";
        Pattern pattern =  Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|Lion)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Found a "+ matcher.group());
        }
    }
}
