
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
public class Task6_PersonCharacteristics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int number = sc.nextInt();
         int birthYear;
            float weight;
            int  height;
            String profession;
        for (int i = 1; i <= number; i++) {
     

       
            String firstName = sc.nextLine();
            
            String familyName = sc.nextLine();
            do {
                System.out.println("Please enter birthYear:");
                birthYear = sc.nextInt();
            } while (birthYear < 1969 || birthYear >= 2017);

            do {
                System.out.println("Please enter weight:");
                weight = sc.nextFloat();
            } while (weight < 0 || weight > 160);

            do {
                System.out.println("Please enter height");
                height = sc.nextInt();
            } while (height < 0 || height > 220);

            

            System.out.println("Please enter profession:");
            profession = sc.nextLine();

            System.out.print(firstName + " " + familyName + " is "
                    + " years old. His weight is " + weight + " and he is "
                    + height + " cm tall. He is a " + profession + ". ");

        }

    }

}
