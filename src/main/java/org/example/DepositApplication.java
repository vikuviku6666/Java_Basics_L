package org.example;

import java.sql.*;
import java.util.Scanner;

public class DepositApplication
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
        System.out.println("JDBC client connected to MySQL server");
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A/C number: ");
        int accountNumber = scanner.nextInt();
        ResultSet rs = statement.executeQuery("SELECT * FROM ACCOUNT WHERE ACCNO="+accountNumber);
        if(rs.next())
        {
            System.out.println("Account found");
        }
        else{
            System.out.println("Account not found");
            return;
        }
        System.out.print("Enter the amount to deposit in SEK: ");
        double amount = scanner.nextDouble();
        int re = statement.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE+"+amount+" WHERE ACCNO="+accountNumber);
        if(re>0)
            System.out.println("Amount deposited successfully");
        else
            System.out.println("Failed to deposit the amount");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM ACCOUNT WHERE ACCNO="+accountNumber);
        while(resultSet.next())
        {
            System.out.println("Account Number: "+resultSet.getInt(1));
            System.out.println("Account Holder: "+resultSet.getString(2));
            System.out.println("Account Balance: "+resultSet.getDouble(3));
        }
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("After performing the operation, the JDBC client disconnected from the MySQL server");

    }
}
