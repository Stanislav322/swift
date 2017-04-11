
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
public class Task2c_PrintMonth {
    
      public static void main(String[]args){
          
            Scanner scan = new Scanner(System.in); 
            int month = scan.nextInt();
            
            switch(month){
                case 3:   
                System.out.println("March");
                break;
                case 8:
                System.out.println("August");
                break;
                default:
                System.out.println("ERROR"); 
                break;
            } 
            
      }
}
