
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
public class Task2d_PrintAllDivisors {
      
       public static void main(String[]args){
            
             Scanner scan = new Scanner(System.in);     
             int number = scan.nextInt();
             
             for(int i=1;i<=number;i++){
                 if(number%i==0){
                     System.out.print(i + " ");
                 }
                 
             }
             
       }
}
