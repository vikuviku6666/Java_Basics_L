package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TemperatureConverter
{
    static int[] temperaturesInFahrenheit = new int[5];
    static int[] temperaturesInCelsius = new int[5];
    static Scanner sc = new Scanner(System.in);

    static int celsiusToFahrenheit(int temp){
        return  (temp * 9/5) + 32;
    }

    static int fahrenheitToCelsius(int temp){
        return  (temp-32)*5/9;
    }

    static void saveTemperatures(){
        int i = 0;
        do {
            System.out.print("Enter Temperature in Celsius:  ");
            int celsius = sc.nextInt();
            temperaturesInCelsius[i] = celsius;
            int fahrenheit = celsiusToFahrenheit(celsius);
            temperaturesInFahrenheit[i] = fahrenheit;
            i++;
        }
        while (i < 5);

    }

    static int averageTemperature(){
        int sum = 0;
        for (int t:temperaturesInFahrenheit)
        {
            sum += t;
        }
        return sum/5;
    }


    public static void main(String[] args)
    {

        saveTemperatures();
        System.out.println("Historical Temperatures in Celsius: " + Arrays.toString(temperaturesInCelsius));
        System.out.println("Historical Temperatures in Fahrenheit: " + Arrays.toString(temperaturesInFahrenheit));
        System.out.println("Average Temperature in Fahrenheit: " + averageTemperature() + "°F");

    }
}
