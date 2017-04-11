
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
public class Task1f_ReadNNumbersOnNewLines {
      
      public static void main(String[]args){
           
             Scanner scan = new Scanner(System.in);
             int number = scan.nextInt();
                  
             String draft = "  ";
             
              while(number>0){
                  int x = scan.nextInt();
                  draft = draft + x + " ";
                 number--;
              }
              System.out.println(draft);
             
             }
             
      }
      

