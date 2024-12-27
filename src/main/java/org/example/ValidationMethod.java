package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationMethod
{
    Scanner input = new Scanner(System.in);
    static String vin;
    // Local Variable
    // Instance Variable
    // Static Variable

    boolean validateName(String name){
        // Regex to check valid username.
        String regex = "^[a-zA-Z](-(?!-)|[a-zA-Z]){2,18}[a-zA-Z]$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (name == null) {
            return true;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);

        // Return if the username
        // matched the ReGex
        return !m.matches();
    }

    String nameData(String option){
        String name;
        //byte[] num = new byte[1000000000];
        do{
            if ((Objects.equals(option, "FirstName")))
            {
                System.out.print("Enter First Name: ");
            } else
            {
                System.out.print("Enter Last Name: ");
            }
            name = input.nextLine();
            //System.out.println(validateName(name));
            if(validateName(name)){
                System.out.println("Incorrect Entry.");
                System.out.print("Do you want to try again? (yes/no): ");
                String choice = input.nextLine();
                if(choice.equalsIgnoreCase("no")){
                    System.out.println("Bye for now, Thanks for taking time to fill the form.");
                    break;
                }
            }
        }while(validateName(name));
        //System.out.println(num[0]);
        System.out.println("Default value for string is null: " + vin);
        return name;
    }


    void formValidation(){
        String FirstName = nameData("FirstName");
        String LastName = nameData("LastName");
        System.out.println("My Full Name is: " + FirstName + " " + LastName);
    }
//
//    do{
//        try{
//            switch (){
//
//            }
//
//        }
//        catch{
//
//    }
//    }while()

    public static void main(String[] args)
    {

       ValidationMethod vm = new ValidationMethod();
       vm.formValidation();

    }
}
