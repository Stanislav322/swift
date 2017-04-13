/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Person {

    private String firstName;
    private String lastName;
    private int yearBorn;
    private float weight;
    private int height;
    private String profession;
    private char gender;
    double[] grades;
    String pronoun1;
    String pronoun2;
    int age;

    public Person(String firstName, String lastName, char gender, int yearBorn,
            float weight, float tall, String profession, double[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.weight = weight;
        this.height = height;
        this.profession = profession;
        this.gender = gender;
        this.grades = grades;
        definePronouns();
    }
    
     private void gradesAverage(){
         
     }
    

    private void definePronouns() {
        switch (gender) {
            case 'M':
                pronoun1 = "He";
                pronoun2 = "His";
                break;
            case 'F':
                pronoun1 = "She";
                pronoun2 = "Her";
                break;
        }
    }

    public String toString() {
        String output = String.format("%s %s is %d years old. %s was born in %d. "
                + "%s weight is %.1f and he is %.0f cm tall. %s is a %s with an average grade of %.3f.",
                firstName,
                lastName,
                age,
                pronoun1,
                yearBorn,
                pronoun2,
                weight,
                height,
                pronoun1,
                profession);

        if (age < 18) {
            output += String.format("%s %s is under-aged.\n",
                    firstName,
                    lastName);

        }
        return output;
        
    }
}