package com.pluralsight.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;    // Eagerly loaded if instance initialized here

    // volatile - Thread safe
    private DbSingleton() {
        if (instance != null)
            throw new RuntimeException("Use getInstance() to create");
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {              // Thread-safe
                if (instance == null) {                      // Double check for multi-threading
                    instance = new DbSingleton();           // Lazy Loading
                }
            }
        }
        return instance;
    }
}