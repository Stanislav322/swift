/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Task9_LeapYear {
    
     public static void main(String[] args){
          
            int year = 2016;
            
          boolean isLeapYear = (year%100==0 && year%400==0)|| year%4==0;    
        
          System.out.println(isLeapYear);
          
       // boolean isDivisibleBy4 = year %4=0; 1
       // boolean isDivisibleBy100 = year%10=0;2 
       // boolean isDivisibleBy400 - year%400==0; 3
       
       //boolean result =  (1&& ! 2)  || 3;
     
       
       
              
      
       
       
          
      }
    
}
