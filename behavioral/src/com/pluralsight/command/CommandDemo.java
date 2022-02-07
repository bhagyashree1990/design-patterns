package com.pluralsight.command;

public class CommandDemo {
    public static void main(String[] args) {
        Task task1= new Task(10,12);
        Task task2= new Task(11,13);

        Thread t1= new Thread(task1);
        t1.start(); //invoker
        Thread t2= new Thread(task2);
        t2.start();
    }
}
