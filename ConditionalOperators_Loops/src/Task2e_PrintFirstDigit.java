
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
public class Task2e_PrintFirstDigit {
    
     public static void main(String[]args){
         
          Scanner sc = new Scanner(System.in);
          int input = sc.nextInt();
          
           int firstDigit = input;
           
           while(firstDigit>9){
               
               firstDigit = firstDigit/10;
              // System.out.println(firstDigit);
           }
           System.out.println("The First Digit is " + firstDigit);
            
     }
    
}
