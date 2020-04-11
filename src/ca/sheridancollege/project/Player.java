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
    private CrazyEights game; // represents the game the players are in

    public Player(String name, GroupOfCards hand, CrazyEights game)
    {
        setPlayerID(name);
        setHand(hand);
        setGame(game);
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
    
        /**
     * @return the game
     */
    public CrazyEights getGame() {
        return game;
    }

    /**
     * @param game the game to set
     */
    public void setGame(CrazyEights game) {
        this.game = game;
    }
    
    // add card to hand
    public void addCard(Card card){
        getHand().addCard(card);
    }
    
    // returns their ID for toString
    @Override
    public String toString(){
        return this.getPlayerID();
    }
}