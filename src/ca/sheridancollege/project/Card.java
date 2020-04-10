package ca.sheridancollege.project;

/**
 *
 * Represents the standard card from a 52 card deck
 * or alternatively known as a French card.
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
