/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Stanislav
 */
public class Task10_PersonCharacteristics {

    public static void main(String[] args) {

        String firstName = "Georgi";
        String lastName = "Georgiev";
        int age = 12;
        double weight = 48.3;
        int height = 156;
        String profession = "student";

//  System.out.print(firstName + " " + lastName + " is " + age + " years old.");
//  System.out.print("His weight is " + weight + " and he is " + height + "cm tall.");
//  System.out.print("He is " + profession);
        System.out.println(firstName + " " + lastName + " is " + age + " years old."
                + "His weight is " + weight + " and he is " + height + "cm tall. " + "He is a " + profession);

    }
}
