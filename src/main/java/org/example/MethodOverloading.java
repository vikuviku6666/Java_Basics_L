package org.example;

public class MethodOverloading
{
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static String add(String a, String b){
        return a + b;
    }
    public static void main(String[] args)
    {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add("Hi ", "Vinay!"));
    }
}
