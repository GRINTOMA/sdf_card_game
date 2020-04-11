package ca.sheridancollege.project;

/*
* Represents the Player in the crazy eight game.
*
* Handles operations related to the player and
* how they interact with the board.  In this case, they
* will be able draw and play cards.
*/

public class Player 
{
    private String playerID; //the unique ID for this player
    private GroupOfCards hand; // represents the player's hand

    public Player(String name, GroupOfCards hand)
    {
        setPlayerID(name);
        setHand(hand);
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }

    /**
     * @return the hand
     */
    public GroupOfCards getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(GroupOfCards hand) {
        this.hand = hand;
    }
    
    // add card to hand
    public void addCard(Card card){
        getHand().addCard(card);
    }
    
    // checks hand for card and removes it
    // returns true if it is in the hand
    public boolean playCard(Card card){
        return hand.getCards().remove(card);
    }
}
