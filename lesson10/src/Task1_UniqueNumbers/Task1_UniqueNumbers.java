/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_UniqueNumbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Stanislav
 */
public class Task1_UniqueNumbers {
  
   public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();
       Set<Integer> set = new HashSet<>();
       
       for(int i =0;i<number;i++){
           set.add(scan.nextInt());
       }
       for(Integer x : set){
       System.out.print(x + " ");
   }  
       System.out.println();
}
}