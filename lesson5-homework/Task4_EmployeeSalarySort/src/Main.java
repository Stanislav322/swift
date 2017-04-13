
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stanislav
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
            Employee[] emp = new Employee[number];

        for (int i = 0; i < number; i++) {

            String line = sc.nextLine();
            String[] split = line.split(",");

            String name = split[0].trim();
            double salary = Double.parseDouble(split[1].trim());
            String position = split[2].trim();
            String department = split[3].trim();
            int age = Integer.parseInt(split[4].trim());
            String email = split[5].trim();

            emp[i] = new Employee(name,salary,position,department,age,email);
            
            
        }

    }

}
