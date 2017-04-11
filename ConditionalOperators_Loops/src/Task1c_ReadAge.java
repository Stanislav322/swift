
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
public class Task1c_ReadAge {
    
       public static void main(String[]args){
           
           Scanner scan = new Scanner(System.in);
           
           int age = scan.nextInt();
           
           if(age>=18){
               System.out.println("YES");
           }else if(age<0){
               System.out.println("ERROR");
               
           }else{
               System.out.println("NO");
           }
                   
           
      
           
       }
    
}
