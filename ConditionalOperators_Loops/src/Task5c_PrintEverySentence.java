
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
public class Task5c_PrintEverySentence {
    
        public static void main(String[]args){
           Scanner scan = new Scanner(System.in);
           String text = scan.nextLine();
            
           for(int i=0;i<text.length();i++){
               char c = text.charAt(i);
               System.out.print(c);
               if(c == '.' || c == '?' || c== '!'){
                   System.out.println();
                }
               
                            
           } 
           
            
           
         
     }
   
}   
    

