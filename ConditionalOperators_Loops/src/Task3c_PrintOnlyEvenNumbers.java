
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
public class Task3c_PrintOnlyEvenNumbers {
    
      public static void main(String[]args){
          Scanner scan = new Scanner(System.in);
          int number = scan.nextInt();
          
          for(int i=0;i<=number;i++){
              int number1 = scan.nextInt();
              if(number1%2==0){
                  System.out.println(number1);
              }
              }
           
          }
                  
      }
    

