
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
public class Task1d_PrintString {
    
          public static void main(String[]args){
              Scanner scan = new Scanner(System.in);
              String str = scan.nextLine();
              
             for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                 System.out.println(c);
              }
              
          }
    
}
