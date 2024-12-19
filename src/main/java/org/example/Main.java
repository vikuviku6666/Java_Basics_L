package org.example;

public class Main
{
    public static void main(String[] args)
    {
        PersonalDataManager data = new PersonalDataManager();
        String firstName = "John";
        String lastName = "Dew";
        int age = 33;
        double height = 1.76;
        double weight = 100;
        boolean student = false;

    String fullName = data.fullName(firstName, lastName);
    boolean adult = data.legalAge(age);
    double bmi = data.bmiCalculator(height, weight);
    String heightInMetersAndCentimeters = data.getHeight(height);
    String personalInfo = data.personInformation(fullName, age, heightInMetersAndCentimeters, bmi);

        System.out.println("Full Name: " + fullName);
        System.out.println("isAdult: " + adult);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println(heightInMetersAndCentimeters);
        System.out.println(personalInfo);
    }
}
