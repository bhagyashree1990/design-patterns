package com.pluralsight.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeDemo {
    public static void main(String[] args) {
        Map<String,String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String,String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");

        Map<String,String> securityAttributes = new HashMap<>();
        securityAttributes.putAll(personAttributes);
        securityAttributes.putAll(groupAttributes);

        System.out.println(securityAttributes);
    }
}
