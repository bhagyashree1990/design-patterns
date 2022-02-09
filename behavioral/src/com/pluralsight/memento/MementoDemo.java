package com.pluralsight.memento;

import java.io.*;

public class MementoDemo {
    private static final String FILE_PATH = "employee.ser";
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAddress("111 E Code Street");
        employee.setEmail("john.doe@test.com");

        serialize(employee);
        Employee newEmployee = deserialize();
        System.out.println(newEmployee.getName());
    }

    public static void serialize(Employee employee) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee deserialize() {
        Employee employee = null;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            employee = (Employee) inputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
