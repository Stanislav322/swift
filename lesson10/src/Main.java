
import java.util.HashMap;
import java.util.Map;
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
public class Main {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         
         
         String sentence = scan.nextLine();
         int number = scan.nextInt();
         scan.nextLine();
         String[] input = sentence.split(" ");
         Map<String,String> map = new HashMap();
         
         
         for(int i =0 ; i<number;i++){
             
            // String line = scan.nextLine();
             String word = input[0].trim();
             String word1 = input[1].trim();
             map.put(word, word1);  
         }
      
        }
     
}

