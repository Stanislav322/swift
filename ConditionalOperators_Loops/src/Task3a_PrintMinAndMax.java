
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
public class Task3a_PrintMinAndMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();

        int x = scan.nextInt();
        
        int min = 4141;
        int max = 0;

        for (int i = 0; i < number; i++) {
            x = scan.nextInt();
            if (min <x) {
                min = x;
            } else if (max>x) {
                max = x;
            }
        }
        System.out.println("min is " + min);
        System.out.println("max is " + max);  
      
       

    }
}
