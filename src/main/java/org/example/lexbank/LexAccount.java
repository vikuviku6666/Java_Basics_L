package org.example.lexbank;

public class LexAccount
{
    private final String name;
    private double balance;

    public LexAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
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
        System.out.printf("Account Balance: %.2f", balance);
    }
}
