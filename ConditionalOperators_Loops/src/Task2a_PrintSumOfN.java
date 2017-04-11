
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
public class Task2a_PrintSumOfN {
    
       public static void main(String[]args){
           
           Scanner sc = new Scanner(System.in);
           int number = sc.nextInt();
              
           
           int sum = 0 ;
                   
           for(int i =0;i<=number;i++){
               sum+=i;
               
           }   
           System.out.println(sum);
            
       }
    
}
