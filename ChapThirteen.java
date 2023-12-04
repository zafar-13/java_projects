package edu.neu.mgen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ChapThirteen {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sys";
        String username = "root";
        String password = "mysqluserroot";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(connection.nativeSQL("SELECT * FROM student"));
            while (resultSet.next()) {
                int stdId = resultSet.getInt("stdId");
                String name = resultSet.getString("stdName");
                String section = resultSet.getString("SClass");
                String dateOfBirth = resultSet.getString("DOB");

                System.out.println("Student ID: " + stdId);
                System.out.println("Name: " + name);
                System.out.println("Class: " + section);
                System.out.println("Date of Birth: " + dateOfBirth);
                System.out.println("------------------------");
            }
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}