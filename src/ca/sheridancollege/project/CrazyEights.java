/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The model of the game.  It will handle all operations related
 * 
 */
public class CrazyEights
{
    private String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    private GroupOfCards deck; // deck players draw from
    private GroupOfCards pile; // the pile cards are played in
    private Suit suit; // represents the suit that must be adhered to
    private int turn; // represents the current player's turn
    
    private int numPlayers;
    Scanner input = new Scanner(System.in);
    
    // constructor
    public CrazyEights(String givenName)
    {
        gameName = givenName;
        getNumPlayers();
        generateDeck();
        generatePlayers();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
    public void setGameName(String gameName){
        this.gameName = gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        ArrayList <Player> listPlayers = new ArrayList<>();
        System.out.println("We will now be getting the IDs for each player.");
        for (int i = 0; i < numPlayers; i++){
            System.out.println("What will player 1's ID be?");
            String playerID = input.nextLine();
            listPlayers.add(new Player(playerID, generateHand(), this));
        }
    }

     /**
     * @return the deck's suit
     */
    public Suit getSuit() {
        return this.suit;
    }

    // set the suit that must be adhered to
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the turn
     */
    public int getTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(int turn) {
        this.turn = turn;
    }
    
        /**
     * @return the deck
     */
    public GroupOfCards getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(GroupOfCards deck) {
        this.deck = deck;
    }

    /**
     * @return the pile
     */
    public GroupOfCards getPile() {
        return pile;
    }

    /**
     * @param pile the pile to set
     */
    public void setPile(GroupOfCards pile) {
        this.pile = pile;
    }
    
    // shuffles the two decks together
    public void shuffle(){
        // take the top card
        Card tempHolder = getPile().getCards().remove(0);
        // adds the remainder of the pile to the deck
        getDeck().addPile(getPile());
        // shuffle the deck
        getDeck().shuffle();
        // clear the pile
        getPile().getCards().clear();
        // add top card back into the pile
        getPile().addCard(tempHolder);
    }
    
    // main game loop
    public void play(
        
    ){};
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    //public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    //public abstract void declareWinner();

   
    // setup to get the players and their IDs
    private void getNumPlayers(){
        System.out.println("How many players are in this game?\n"
                + "Enter a number between 2 and 7.");
        String n = input.nextLine();
        while (!n.trim().matches("[2-7]")){
            System.out.println("Invalid input! Try again.\n"
                    + "How many players are in this game?\n"
                    + "Choose a number between 2 and 7.");
            n = input.nextLine();
        }
        
        numPlayers = Integer.parseInt(n);
    }
    
    // generate 52 card deck for 2-4 players
    // generate 104 card deck for 5-7 players
    private void generateDeck(){
        if (numPlayers <5){
            setDeck(new GroupOfCards(1));
        } else {
            setDeck(new GroupOfCards(2));
        }
    }
    
    // generates the players for the game
    private void generatePlayers(){
        System.out.println("We will now be getting the IDs for each player.");
        for (int i = 0; i < numPlayers; i++){
            System.out.println("What will player 1's ID be?");
            String playerID = input.nextLine();
        }
    }
    
    // generates a GroupOfCards object to be set to a player's hand
    // 7 cards for 2 player game, otherwise 5 per player
    private GroupOfCards generateHand(){
        GroupOfCards hand = new GroupOfCards();
        if (numPlayers == 2){
            for (int i = 0; i < 7; i++) hand.addCard(drawFromDeck());
        } else {
            for (int i = 0; i < 5; i++) hand.addCard(drawFromDeck());
        }
        
        return hand;
    }
    
    // remove and returns top card from deck
    public Card drawFromDeck(){
        if (getDeck().size() == 0) shuffle();
        return getDeck().getCards().remove(0);
    }
}//end class
