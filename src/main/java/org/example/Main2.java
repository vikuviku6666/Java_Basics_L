package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
        System.out.println("JDBC client connected to MySQL server");
        Statement statement = connection.createStatement();
        int re = statement.executeUpdate("INSERT INTO ACCOUNT VALUES (10001, 'John Doe', 300000)");
        System.out.println("Number of records inserted: " + re);
        statement.close();
        connection.close();
        System.out.println("After performing the operation, the JDBC client disconnected from the MySQL server");

    }
}
