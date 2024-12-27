package org.example;

public class LexBank
{
    public static void main(String[] args)
    {
        LexAccount account = new LexAccount("John", 1000);
        account.printAccountInfo();
        account.deposit(500);
        account.printAccountInfo();
        account.withdraw(200);
        account.printAccountInfo();
    }
}
