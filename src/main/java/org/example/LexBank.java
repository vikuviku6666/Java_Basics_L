package org.example;

import java.util.ArrayList;

public class LexBank
{
    static ArrayList<LexAccount> accounts = new ArrayList<>();

    private LexBank()
    {
    }

    public static ArrayList<LexAccount> getAccounts()
    {
        return accounts;
    }

    public static void setAccounts(LexAccount account)
    {
        accounts.add(account);
    }
    public static void AccountInfo()
    {
        for (LexAccount account : accounts)
        {
            System.out.println("===================================");
            account.printAccountInfo();

        }
    }
}
