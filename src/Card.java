import javax.swing.ImageIcon;

/*
 /**
 * @author Alec Ellsworth
 * CS110 - Assignment 5
 * Due Monday, October 7th
 * Class Card
 * Represents a single card from a standard 52 card deck
 */

public class Card {
    
    //declare constants
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int HEARTS = 3;
    public static final int DIAMONDS = 4;
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    //declare variables
    private int rank;
    private int suit;
    private ImageIcon image;
    /**
     * default constructor accepts suit and rank as arguments and assigns the objects suit and rank accordingly
     * @param suit
     * @param rank 
     */
    public Card (int suit, int rank){
        this.suit = suit;
        this.rank = rank;
        if(suit == 1){
            if(rank==1){
                image = new ImageIcon("aces.jpg");
            }
            else if (rank == 2){
                image = new ImageIcon("2s.jpg");
            }
            else if (rank == 3){
                image =  new ImageIcon("3s.jpg");
            }
            else if (rank == 4){
                image = new ImageIcon("4s.jpg");
            }
            else if (rank == 5){
                image = new ImageIcon("5s.jpg");
            }
            else if (rank == 6){
                image = new ImageIcon("6s.jpg");
            }
            else if(rank == 7){
                image = new ImageIcon("7s.jpg");
            }
            else if (rank == 8){
                image = new ImageIcon("8s.jpg");
            }
            else if (rank == 9){
                image = new ImageIcon("9s.jpg");
            }
            else if (rank == 10){
                image = new ImageIcon("10s.jpg");
            }
            else if (rank == 11){
                image = new ImageIcon("jacks.jpg");
            }
            else if (rank == 12){
                image = new ImageIcon("queens.jpg");
            }
            else if (rank == 13){
                image = new ImageIcon("kings.jpg");
            }
        }
        else if(suit == 2){
            if(rank==1){
                image = new ImageIcon("acec.jpg");
            }
            else if (rank == 2){
                image = new ImageIcon("2cs.jpg");
            }
            else if (rank == 3){
                image =  new ImageIcon("3c.jpg");
            }
            else if (rank == 4){
                image = new ImageIcon("4c.jpg");
            }
            else if (rank == 5){
                image = new ImageIcon("5c.jpg");
            }
            else if (rank == 6){
                image = new ImageIcon("6c.jpg");
            }
            else if(rank == 7){
                image = new ImageIcon("7c.jpg");
            }
            else if (rank == 8){
                image = new ImageIcon("8c.jpg");
            }
            else if (rank == 9){
                image = new ImageIcon("9c.jpg");
            }
            else if (rank == 10){
                image = new ImageIcon("10c.jpg");
            }
            else if (rank == 11){
                image = new ImageIcon("jackc.jpg");
            }
            else if (rank == 12){
                image = new ImageIcon("queenc.jpg");
            }
            else if (rank == 13){
                image = new ImageIcon("kingc.jpg");
            }
        }
        else if (suit == 3){
            if(rank==1){
                image = new ImageIcon("aceh.jpg");
            }
            else if (rank == 2){
                image = new ImageIcon("2h.jpg");
            }
            else if (rank == 3){
                image =  new ImageIcon("3h.jpg");
            }
            else if (rank == 4){
                image = new ImageIcon("4h.jpg");
            }
            else if (rank == 5){
                image = new ImageIcon("5h.jpg");
            }
            else if (rank == 6){
                image = new ImageIcon("6h.jpg");
            }
            else if(rank == 7){
                image = new ImageIcon("7h.jpg");
            }
            else if (rank == 8){
                image = new ImageIcon("8h.jpg");
            }
            else if (rank == 9){
                image = new ImageIcon("9h.jpg");
            }
            else if (rank == 10){
                image = new ImageIcon("10h.jpg");
            }
            else if (rank == 11){
                image = new ImageIcon("jackh.jpg");
            }
            else if (rank == 12){
                image = new ImageIcon("queenh.jpg");
            }
            else if (rank == 13){
                image = new ImageIcon("kingh.jpg");
            }
        }
        else if (suit == 4){
            if(rank==1){
                image = new ImageIcon("aced.jpg");
            }
            else if (rank == 2){
                image = new ImageIcon("2d.jpg");
            }
            else if (rank == 3){
                image =  new ImageIcon("3d.jpg");
            }
            else if (rank == 4){
                image = new ImageIcon("4d.jpg");
            }
            else if (rank == 5){
                image = new ImageIcon("5d.jpg");
            }
            else if (rank == 6){
                image = new ImageIcon("6d.jpg");
            }
            else if(rank == 7){
                image = new ImageIcon("7d.jpg");
            }
            else if (rank == 8){
                image = new ImageIcon("8d.jpg");
            }
            else if (rank == 9){
                image = new ImageIcon("9d.jpg");
            }
            else if (rank == 10){
                image = new ImageIcon("10d.jpg");
            }
            else if (rank == 11){
                image = new ImageIcon("jackd.jpg");
            }
            else if (rank == 12){
                image = new ImageIcon("queend.jpg");
            }
            else if (rank == 13){
                image = new ImageIcon("kingd.jpg");
            }
        }
       
    }
    
        
    /**
     * getSuit method returns the object's suit
     * @return suit
     */
    public int getSuit(){
        return suit;
    }
    
    /**
     * getRank method returns the object's rank
     * @return rank
     */
    public int getRank(){
        return rank;
    }
    
    public ImageIcon getImage(){
        return image;
    }
    /**
     * toString method returns the suit and rank of the card as a string.
     * @return returnString
     */
    public String toString(){
        //assign string to suit:
        String suitString = "";
        switch(suit){
            case 1:
                suitString = "Spades";
                break;
            case 2: 
                suitString = "Clubs";
                break;
            case 3:
                suitString = "Hearts";
                break;
            case 4:
                suitString = "Diamonds";
                break;
        }
        
        //assign string to rank
        String rankString = "";
        switch(rank){
            case 1:
                rankString = "Ace";
                break;
            case 2:
                rankString = "Two";
                break;
            case 3:
                rankString = "Three";
                break;
            case 4: 
                rankString = "Four";
                break;
            case 5:
                rankString = "Five";
                break;
            case 6:
                rankString = "Six";
                break;
            case 7:
                rankString = "Seven";
                break;
            case 8:
                rankString = "Eight";
                break;
            case 9:
                rankString = "Nine";
                break;
            case 10:
                rankString = "Ten";
                break;
            case 11:
                rankString = "Jack";
                break;
            case 12:
                rankString = "Queen";
                break;
            case 13:
                rankString = "King";
                break;
        }
        
        //return string 
        String returnString = rankString + " of " + suitString;
        return returnString;
    }
    
    /**
     * equals method compares one card with another. 
     * @param otherCard
     * @return 
     */
    public boolean equals(Card otherCard){
        boolean isEqual = false;
        if(rank == otherCard.rank)
            isEqual = true;
        
        return isEqual;
    }
    
    
}
