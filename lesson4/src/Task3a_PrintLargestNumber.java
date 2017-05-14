
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
public class Task3a_PrintLargestNumber {
    
       public static void main(String[]args){
          Scanner scan = new Scanner(System.in);
           int number = scan.nextInt();
           int[]arr = new int[number];
          int max=0;
           
           for(int i=0;i<arr.length;i++){
               arr[i]=scan.nextInt();
               if(arr[i]>max){
                   max=arr[i];
               }
               
           }
            System.out.println("The largest number is: " + max);  

         
    
}
}