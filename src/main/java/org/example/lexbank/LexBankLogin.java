package org.example.lexbank;

import java.util.Objects;
import java.util.Scanner;

public class LexBankLogin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        boolean active = true;
        while (active) {
            System.out.println("Bank Application");
            System.out.println("1. Login");
            System.out.println("2. Open Account");
            System.out.println("3. Exit");
            System.out.println("=======================================================");
            System.out.println();

            System.out.print("Enter Your option: ");
            int selection = sc.nextInt();

            switch(selection) {
                case 1:
                    login();
                    break;
                case 2:
                    openAccount();
                    break;
                case 3:
                    active = false;
                    break;
                default:
                    System.out.println("Try Again");
            }
        }
    }
    static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        if(Objects.equals(name, "Vin") && Objects.equals(password, "1234")){
            System.out.println("=======================================================");
            System.out.println("You are logged in");
            System.out.println("=======================================================");
            System.out.println();
        }else{
            System.out.println("=======================================================");
            System.out.println("Try Again");
            System.out.println("=======================================================");
            System.out.println();
        }
    }

    static void openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        if(Objects.equals(name, "Vinay")){
            System.out.println("=======================================================");
            System.out.println("Account Opened");
            System.out.println("=======================================================");
            System.out.println();
        }else{
            System.out.println("=======================================================");
            System.out.println("Try Again");
            System.out.println("=======================================================");
            System.out.println();
        }
    }
}
