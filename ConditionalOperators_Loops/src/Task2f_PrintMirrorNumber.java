
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
public class Task2f_PrintMirrorNumber {
    
       public static void main(String[]args){
           
           
           int num;
           int reverse=0;
         
            System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
          num = in.nextInt();

        
        while (num != 0) {  // 12 
        reverse = reverse * 10; // 0
        reverse = reverse + num % 10; // 1 //2 //3 //2 // 1  
            num = num / 10; //1232 //123 //12    //1
        }
        System.out.println("your reverse number is : " + reverse);
       }
    
}
