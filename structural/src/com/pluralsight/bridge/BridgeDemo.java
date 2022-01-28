package com.pluralsight.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeDemo {
    private static final String DB_URL = "jdbc:postgresql://localhost/world";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "pass123";
    private static final String QUERY = "create table address(id int,street_name varchar(20),city varchar(20))";

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(QUERY);
            System.out.println("Created table address");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
