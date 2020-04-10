package ca.sheridancollege.project;

/**
 *
 * @author Richard
 */
public enum Rank {
    ACE(1, "Ace", "A"),
    TWO(2, "Two", "2"),
    THREE(3, "Three", "3"),
    FOUR(4, "Four", "4"),
    FIVE(5, "Five", "5"),
    SIX(6, "Six", "6"),
    SEVEN(7, "Seven", "7"),
    EIGHT(8, "Eight", "8"),
    NINE(9, "Nine", "9"),
    TEN(10, "Ten", "10"),
    JACK(11, "Jack", "J"),
    QUEEN(12, "Queen", "Q"),
    KING(13, "King", "K");
    
    private int value;
    private String name;
    private String shortName;
    
    private Rank(int value, String name, String shortName){
        this.value = value;
        this.name = name;
        this.shortName = shortName;
    }

    // returns value of the card
    public int getValue() {
        return value;
    }

    // returns name of the card
    public String getName() {
        return name;
    }

    // returns short form name of the card
    public String getShortName() {
        return shortName;
    }
}