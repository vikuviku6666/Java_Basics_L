package org.example.lexbank;

import java.util.ArrayList;

// Singleton Design Pattern
public class LexBank
{
    private static LexBank instance;
    private static ArrayList<LexAccount> accounts = new ArrayList<>();

    private LexBank()
    {
    }

    public synchronized static LexBank getInstance()
    {
        if (instance == null)
        {
            instance = new LexBank();
        }
        return instance;
    }

    public ArrayList<LexAccount> getAccounts()
    {
        return accounts;
    }

    public void setAccounts(ArrayList<LexAccount> accounts)
    {
        LexBank.accounts = accounts;
    }
    public void AccountInfo()
    {
        for (LexAccount account : accounts)
        {

            account.printAccountInfo();
            System.out.println();
            System.out.println("===================================");

        }
    }

    public Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
