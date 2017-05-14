
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
public class Task3c_PrintClusterCount {
    
       public static void main(String[]args){
           Scanner scan = new Scanner(System.in);
           int number = scan.nextInt();
            int[]arr = new int[number];
            int count=0; //
            
           
            
            
            
            for(int i=0;i<arr.length;i++){
                arr[i]=scan.nextInt();               
            }
             Arrays.sort(arr);
          
            for(int i=1;i<arr.length;i++){
                if(arr[i]==arr[i-1]){
                    count++;
               //   System.out.println(i);
                }
             
            }
       System.out.println(count);
           
            
           
       }
}
