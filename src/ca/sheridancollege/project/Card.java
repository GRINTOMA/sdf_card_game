/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Richard
 */
public class Card {

    private Rank rank;
    private Suit suit;
    
    public Card(Rank rank, Suit suit){
        setRank(rank);
        setSuit(suit);
    }

    /**
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    @Override
    // returns short form of each card
    public String toString(){
        return this.getRank().getShortName()+this.getSuit().getSymbol();
    }
}
