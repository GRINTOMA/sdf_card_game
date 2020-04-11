package ca.sheridancollege.project;

/**
 * Checks for valid inputs and plays according
 * to the game state and the current player's hand.
 */

public class PlayValidator {
    
    // checks to see if the user input a valid card
    public static boolean validateCard(String card){
        return card.matches("[schdSCHD]([ajqkAJQK]|[1-9]|10)");
    }
    
    // checks to see if user hand contains the card
    // that they specified
    public static boolean inHand(GroupOfCards hand, Card card){
        return hand.getCards().contains(card);
    }
    
    // A valid play is one where either the played card matches
    // the suit of the top card or is an eight.
    public static boolean validatePlay(Card topCard, Card playCard){
        return (topCard.getSuit() == playCard.getSuit() ||
                playCard.getRank() == Rank.EIGHT);
    }
}
