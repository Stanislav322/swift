/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task0_Cards;

/**
 *
 * @author Stanislav
 */
public class Task0_Cards {
    public static void main(String[]args){
     
         for(CardRank rank : CardRank.values()){
             System.out.print(rank + " ");
         }
         System.out.println();
         
        for(CardSuit suit : CardSuit.values()){
            System.out.print(suit + " ");
        }   
        System.out.println();
        
       }
     
     }
     
    

