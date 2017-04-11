
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
public class PrintCountOfWords {
    
        public static void main(String[]args){
            
            Scanner scan = new Scanner(System.in);
             String str = scan.nextLine();
           int wordCount = 1;
             
             for(int i=0;i<str.length();i++){
                if(str.charAt(i)== ' '|| str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)== '!' || str.charAt(i)== ','){
                    wordCount++;
                } 
             }
            System.out.println("Word count is = " + wordCount);
           
                
            
            
        }
    
}
