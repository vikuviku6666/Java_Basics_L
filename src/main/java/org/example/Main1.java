package org.example;

public class Main1
{
    public static void main(String[] args)
    {
        LexAccount account1 = new LexAccount("John Doe", 1000);
        LexAccount account2 = new LexAccount("Jane Doe", 2000);
        LexAccount account3 = new LexAccount("Karl Doe", 3000);
        LexAccount account4 = new LexAccount("Lars Doe", 4000);
        LexAccount account5 = new LexAccount("Gustav Doe", 5000);
        LexAccount account6 = new LexAccount("David Doe", 6000);

        LexBank.setAccounts(account1);
        LexBank.setAccounts(account2);
        LexBank.setAccounts(account3);
        LexBank.setAccounts(account4);
        LexBank.setAccounts(account5);
        LexBank.setAccounts(account6);
        LexBank.getAccounts().get(0).deposit(5000);
        LexBank.getAccounts().get(0).withdraw(1000);
        LexBank.getAccounts().get(1).deposit(50000);
        LexBank.getAccounts().get(1).withdraw(10000);
        LexBank.getAccounts().get(2).deposit(5000);
        LexBank.getAccounts().get(2).withdraw(1000);
        LexBank.getAccounts().get(3).deposit(50000);
        LexBank.getAccounts().get(3).withdraw(10000);
        LexBank.getAccounts().get(4).deposit(5000);
        LexBank.getAccounts().get(4).withdraw(1000);
        LexBank.getAccounts().get(5).deposit(50000);
        LexBank.getAccounts().get(5).withdraw(10000);

        LexBank.AccountInfo();
        System.out.println("===================================");
    }
}
