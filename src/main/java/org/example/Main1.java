package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1
{
    public static ArrayList<LexAccount> accounts(){
        LexAccount account1 = new LexAccount("John Doe", 1000);
        LexAccount account2 = new LexAccount("Jane Doe", 2000);
        LexAccount account3 = new LexAccount("Karl Doe", 3000);
        LexAccount account4 = new LexAccount("Lars Doe", 4000);
        LexAccount account5 = new LexAccount("Gustav Doe", 5000);
        LexAccount account6 = new LexAccount("David Doe", 6000);
        return new ArrayList<>(Arrays.asList(account1, account2, account3, account4, account5, account6));
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        LexBank lexBank = LexBank.getInstance();
        //lexBank.clone();

        lexBank.setAccounts(accounts());
        ArrayList<LexAccount> accounts = lexBank.getAccounts();
        for (LexAccount account : accounts)
        {
            account.deposit(Math.random() * 1000);
            account.withdraw(Math.random() * 500);
        }
        System.out.println("===================================");
        lexBank.AccountInfo();
    }
}
