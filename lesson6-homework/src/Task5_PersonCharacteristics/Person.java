/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5_PersonCharacteristics;

import java.time.LocalDate;

/**
 *
 * @author Stanislav
 */
public class Person {

    private String firstName;
    private String lastName;
    private int yearBorn;
    private int height;
    private char gender;
    private String pronoun1;
    private String pronoun2;
    private int age;
    LocalDate dateBorn;
    SecondaryEducation secondaryEducation;

    public Person(String firstName, String lastName, char gender, int height, int age, LocalDate dateBorn, SecondaryEducation secondaryEducation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.gender = gender;
        this.age = age;
        this.dateBorn = dateBorn;
        this.secondaryEducation = secondaryEducation;
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

    @Override
    public String toString() {
        String output = String.format("%s %s is %d years old. %s was born in %d. "
                + "%s weight is %.1f and he is %.0f cm tall. %s is  with an average grade of %.3f.",
                firstName,
                lastName,
                age,
                pronoun1,
                yearBorn,
                pronoun2,
                height,
                pronoun1
        );

        if (age < 18) {
            output += String.format("%s %s is under-aged.\n",
                    firstName,
                    lastName);

        }
        return output;

    }
}
