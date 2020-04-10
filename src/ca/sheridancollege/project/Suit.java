package ca.sheridancollege.project;

/**
 *
 * @author Richard
 */
public enum Suit {
    CLUBS(1, "Clubs", '\u2663'),
    DIAMONDS(2, "Diamonds", '\u2662'),
    HEARTS(3, "Hearts", '\u2661'),
    SPADES(4, "Spades", '\u2660');
    
    private int value;
    private String name;
    private char symbol;
    
    private Suit(int value, String name, char symbol){
        this.value = value;
        this.name = name;
        this.symbol = symbol;
    }

    // gets the value of each suit
    public int getValue() {
        return value;
    }

    // returns the name of each suit
    public String getName() {
        return name;
    }
    
    // returns the symbol associated with the suit
    public char getSymbol(){
        return symbol;
    }
}
