package ca.sheridancollege.project;

/**
 *
 * @author Richard
 */
public class PlayValidator {
    // A valid play is one where either the played card matches
    // the suit of the top card or is an eight.
    public static boolean validatePlay(Card topCard, Card playCard){
        return (topCard.getSuit() == playCard.getSuit() ||
                playCard.getRank() == Rank.EIGHT);
    }
}
