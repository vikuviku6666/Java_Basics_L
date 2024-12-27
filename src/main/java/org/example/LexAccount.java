package org.example;

public class LexAccount
{
    String name;
    double balance;

    public LexAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void printAccountInfo()
    {
        System.out.println("Account Name: " + name);
        System.out.println("Account Balance: " + balance);
    }
}
