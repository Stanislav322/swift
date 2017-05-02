/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_PeoplePresentation;

import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        //zashto pri pechataneto na lastName i na student i na worker mi dava null???
        
        while (!line.equals("END")) {

            String[] input = line.split(" ");
            String firstName = input[0];
            String lastName = input[1];

            Person person;

            if (input.length == 4) {
                Double weekSalary = Double.parseDouble(input[2]);
                Double workHoursPerDay = Double.parseDouble(input[3]);
                person = new Worker(firstName, lastName, weekSalary, workHoursPerDay);
            } else {
                String facultyNumber = input[2];
                int lectureCount = Integer.parseInt(input[3]);
                int exerciseCount = Integer.parseInt(input[4]);
                person = new Student(firstName, lastName, facultyNumber, lectureCount, exerciseCount);
            }
            System.out.println(person.printInfo());
            line = scanner.nextLine();
        }

    }
}
