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
public class Card implements Comparable<Card>{
    private final CardSuit color;
    private final CardRank rank;

    public Card(CardSuit color, CardRank rank) {
        this.color = color;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",this.rank,this.color );
    }
 
    
    
    
    @Override
    public int compareTo(Card t){
        if(this.rank.equals(t.rank)){
            return 0;
        }
        return -1;
    }
    
    
    
}
