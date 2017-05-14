/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_CommonSubset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Stanislav
 */
public class Task2_CommonSubset {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
     
        Set<Integer> firstSet = new HashSet<>();        
        Set<Integer> secondSet = new HashSet<>();
        
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        
        for(int i = 0;i<firstNumber;i++){
            firstSet.add(scan.nextInt());
        }
        for(int i = 0;i<secondNumber;i++){
            secondSet.add(scan.nextInt());
        }
        secondSet.retainAll(firstSet);  // ot vtoriq set iztriva tezi elementi koito ne se sudurjat v purviq
        
        if(firstSet.isEmpty()){
            System.out.println("NO");
        }else{
            System.out.println(secondSet);  
       
      /*   Set<Integer> common = new HashSet(firstSet);
         common.retainAll(secondSet);
         if(common.isEmpty()){
             System.out.println("NO");
         }
         for(Integer x : common){
             System.out.print(x + " ");  */
         }
       
        }
        
    }

