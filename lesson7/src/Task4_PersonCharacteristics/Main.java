/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4_PersonCharacteristics;

import education.Education;
import education.GradedEducation;
import education.HigherEducation;
import education.PrimaryEducation;
import education.SecondaryEducation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Main {
    // Tuk ne znam kakvo se sluchva.Taka napisana mi izlizat razni exceptioni...Ne moga da q dovursha.

    public static void main(String[] args) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < number; i++) {

            float finalGrade = -1;

            String line = scan.nextLine();
            String[] split = line.split(";");

            String firstName = split[0];
            String lastName = split[1];
            char gender = Character.toUpperCase(split[2].toCharArray()[0]);
            short height = Short.parseShort(split[3].trim());
            String typeGrad = split[4].trim();
            LocalDate dateOfBirth = LocalDate.parse(split[4].trim(), formatter);
            String institutionName = split[5].trim();
            LocalDate enrollmentDate = LocalDate.parse(split[6].trim(), formatter);
            LocalDate graduationDate = LocalDate.parse(split[7].trim(), formatter);

            if (split.length == 10) {
                finalGrade = Float.parseFloat(split[9].trim());
            }
            switch (typeGrad) {
                case "B":
                case "M":
                case "D": {
                    HigherEducation education = new HigherEducation(institutionName, enrollmentDate, graduationDate, finalGrade);

                }
                case "P":{
                    PrimaryEducation education = new PrimaryEducation(institutionName, enrollmentDate, graduationDate, finalGrade);
                }
            }

        }

    }
}
