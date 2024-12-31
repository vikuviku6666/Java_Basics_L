package org.example;

import java.sql.*;
import java.util.Scanner;

public class DepositApplication
{
    public static void main(String[] args) throws SQLException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A/C number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter the amount to deposit in SEK: ");
        double amount = scanner.nextDouble();
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
        System.out.println("JDBC client connected to MySQL server");
        Statement statement = connection.createStatement();
        int re = statement.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE+"+amount+" WHERE ACCNO="+accountNumber);
        if(re>0)
            System.out.println("Amount deposited successfully");
        else
            System.out.println("Failed to deposit the amount");
        ResultSet rs = statement.executeQuery("SELECT * FROM ACCOUNT WHERE ACCNO="+accountNumber);
        System.out.println(rs);
        while(rs.next())
        {
            System.out.println("Account Number: "+rs.getInt(1));
            System.out.println("Account Holder: "+rs.getString(2));
            System.out.println("Account Balance: "+rs.getDouble(3));
        }
        statement.close();
        connection.close();
        System.out.println("After performing the operation, the JDBC client disconnected from the MySQL server");

    }
}
