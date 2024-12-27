package org.example;

import java.util.ArrayList;

public class LexBank
{
    private static ArrayList<LexAccount> accounts = new ArrayList<>();

    private LexBank()
    {
    }

    public static ArrayList<LexAccount> getAccounts()
    {
        return accounts;
    }

    public static void setAccounts(ArrayList<LexAccount> accounts)
    {
        LexBank.accounts = accounts;
    }
    public static void AccountInfo()
    {
        for (LexAccount account : accounts)
        {

            account.printAccountInfo();
            System.out.println();
            System.out.println("===================================");

        }
    }
}
