
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
public class Task2g_PrintSumOfDigits {
      
      public static void main(String[]args){
          
          Scanner in = new Scanner(System.in);
          int number = in.nextInt();
          
          int input = number;
            int sum=0;
          while(input!=0){ 
              int lastDigit = input%10;
              sum+=lastDigit;
              input/=10; 
          }
          
          System.out.println(sum);
          
      }
}
