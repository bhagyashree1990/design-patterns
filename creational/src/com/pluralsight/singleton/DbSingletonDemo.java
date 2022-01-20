package com.pluralsight.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton dbSingletonInstance1 = DbSingleton.getInstance();
        System.out.println(dbSingletonInstance1);

        DbSingleton dbSingletonInstance2 = DbSingleton.getInstance();
        System.out.println(dbSingletonInstance2);
    }
}
