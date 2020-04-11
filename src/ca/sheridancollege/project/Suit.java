package ca.sheridancollege.project;

/**
 * Represents the Suits for the Card class.
 */
public enum Suit {
    CLUBS(1, "C", '\u2663'),
    DIAMONDS(2, "D", '\u2662'),
    HEARTS(3, "H", '\u2661'),
    SPADES(4, "S", '\u2660');
    
    private int value;
    private String name;
    private char symbol;
    
    private Suit(int value, String name, char symbol){
        this.value = value;
        this.name = name;
        this.symbol = symbol;
    }
    
    // get suit based on string
    public static Suit getSuitFromLetter(String letter){
        for (Suit s : values()){
            if (s.name.equals(letter)) return s;
        }
        return null;
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
