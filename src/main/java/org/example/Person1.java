package org.example;

public class Person1
{
    String firstName; // String is the best option for names
    String lastName;
    int age; // use int to show the age and age done not need precision value and it is a whole number
    float heightInMeters; // for precision i have selected float for height and weight
    float weightInKgs;
//A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters
// such as _ underscore and $ dollar sign. The first character must not be a digit. Blank spaces cannot
// be used in variable names
    public Person1(String firstName, String lastName, int age, float heightInMeters, float weightInKgs)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heightInMeters = heightInMeters;
        this.weightInKgs = weightInKgs;
    }

    int personAgeInFiveYears(int age){
        return age + 5;
    }
// If we try to save decimal value like float in to int we need to do type casting, and it is explicit
    int personHeightInCentimeters(float height){
        return (int)(height * 100);
    }



    public static void main(String[] args)
    {
        Person1 person = new Person1("Vinay", "Kunta", 30, 1.76f, 98.5f);
        person.age = 60;
        System.out.println("First Name: " + person.firstName + " Last Name: " + person.lastName);
        System.out.println("The age of a person is " + person.age);
        System.out.println("The height is " + person.heightInMeters + " and the weight of the person is " + person.weightInKgs);
        System.out.println("Person age in five years " + person.personAgeInFiveYears(person.age));
        System.out.println("Person height in Centimeters " + person.personHeightInCentimeters(person.heightInMeters));
    }

}
