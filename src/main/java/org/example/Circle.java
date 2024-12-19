package org.example;

//Selection iteration jump

public class Circle
{
    private static final double PI = 3.14;
    static double areaOfCircle(double r){
        return (PI * r * r);
    }

    static double circumferenceOfCircle(double r){
            return 2 * PI * r;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = areaOfCircle(radius);
        double circumference = circumferenceOfCircle(radius);

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference Of Circle: " + circumference);

    }
}