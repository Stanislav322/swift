/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_Deck;

/**
 *
 * @author Stanislav
 */
public class Task1_Deck {
  
    public static void main(String[]args){
         for (int i = 0; i < CardSuit.values().length; i++) {
            for (int j = 0 ; j < CardRank.values().length; j++) {
                Card card = new Card(CardSuit.values()[i], CardRank.values()[j]);
                   System.out.println(card.toString());
            }
        }             

         
    }
    
}
