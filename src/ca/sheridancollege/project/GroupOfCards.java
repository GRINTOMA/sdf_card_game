package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/*
* GroupOfCards is designed to represent both the player's hand
* alongside the game's deck in which players will draw from.
* It'll also represent the face-up pile in which cards will be
* played.
*/

public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    
    // default constructor
    public GroupOfCards()
    {
    }
    
    // constructor for generating decks
    public GroupOfCards(int i){
        generateDeck(i);
    }
    
    public void setCards(ArrayList<Card> cards){
        this.cards = cards;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> getCards()
    {
        return cards;
    }
    
    // for shuffling the deck of cards
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
    // generates the deck of cards
    // numOfDecks is determined by the number of players
    // where passing a certain thresholds will
    // involve multiple decks in the game
    public void generateDeck(int numOfDecks){
        for (Rank r : Rank.values()){
            for (Suit s : Suit.values()){
                // will add in duplicates of the card if necessary
                for (int i = 0; i < numOfDecks; i++)
                    cards.add(new Card(r, s));
            }
        }
    }
    
    // add card to arraylist cards
    public void addCard(Card card){
        cards.add(card);
    }
}//end class
