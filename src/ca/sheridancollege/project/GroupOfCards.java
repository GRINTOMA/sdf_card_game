/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * An ArrayList of cards for tracking both the
 * player's hand alongside the deck and pile 
 * for the game.
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    // default constructor
    public GroupOfCards()
    {
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
