
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
public class Task3b_PrintSortedNumbers {
    
       public static void main(String[]args){
           Scanner scan = new Scanner(System.in);
           int number = scan.nextInt();
           int[]arr = new int[number];
           
           for(int i=0;i<arr.length;i++){
               
               arr[i] = scan.nextInt();
           }
           Arrays.sort(arr);
          
           for(int i=0;i<arr.length;i++){
               System.out.print(" " + arr[i]);
           }
       }
      
}
