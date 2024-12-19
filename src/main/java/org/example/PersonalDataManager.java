package org.example;

public class PersonalDataManager
{
    String firstName;
    String lastName;
    int age;
    double height;
    double weight;
    boolean student;

    String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    // i have assumed legal age is 18 and above
    boolean legalAge(int age){
        return age >= 18;
    }

    double bmiCalculator(double height, double weight){
        double bmi = weight/(height* height);
        return Math.floor(bmi * 100) / 100;
    }

    String getHeight(double height){
        return "height: " + height +  "m and " + height*100 + "cm";
    }

    String personInformation(String fullName, double age, String height, double bmi ){
        return "The person full name is " + fullName + ", age is " + age + " years old " + height +
                " and BMI is " + bmi;
    }


}
