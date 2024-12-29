package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DepositApplication
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
        System.out.println("JDBC client connected to MySQL server");
        Statement statement = connection.createStatement();
        int re = statement.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE + 10000");
        System.out.println("Number of records updated: " + re);
        statement.close();
        connection.close();
        System.out.println("After performing the operation, the JDBC client disconnected from the MySQL server");

    }
}
