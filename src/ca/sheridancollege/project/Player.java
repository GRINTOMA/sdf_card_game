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

    public Player(String name)
    {
        playerID= name;
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
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public void play(){}
    
}
