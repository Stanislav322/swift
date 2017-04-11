
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
public class Task1d_IsEvenOrOdd {
    
       public static void main(String[]args){
           
           Scanner scan = new Scanner(System.in);
           
            int number = scan.nextInt();
            
            if(number%2==0){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }
            
       }
    
}
