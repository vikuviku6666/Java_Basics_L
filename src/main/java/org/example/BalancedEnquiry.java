package org.example;

import java.sql.*;
import java.util.Scanner;

public class BalancedEnquiry
{
    public static void main(String[] args) throws SQLException
    {
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
       Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A/C number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("JDBC client connected to MySQL server");
        ResultSet resultSet = statement.executeQuery("SELECT BALANCE FROM ACCOUNT WHERE ACCNO="+accountNumber);
        if(resultSet.next())
        {
            System.out.println("Account found");
            System.out.println("Account Balance is : "+resultSet.getDouble(1) + " SEK");
        }
        else{
            System.out.println("Account not found");
            return;
        }
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("After performing the operation, the JDBC client disconnected from the MySQL server");
    }
}
