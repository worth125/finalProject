
import java.util.Random;



/**
 * Deck Class. A deck of shuffled playing cards
 * CS 110 Assignment 10
 * @author Alec Ellsworth
 */
public class Deck extends Pile {
    public final int DECK_SIZE = 52;
    
    /**
     * default constructor creates a pile and initializes it to a new, shuffled deck of 52 cards. 
     */
    public Deck(){
        super();
        
        //create an ordered deck of Card Objects
        for (int i = 1; i <=4; i++){
            for (int j = 1; j<=13; j++){
                this.get().add(new Card(i, j));
            }
        }
        
        //shuffle the deck
        this.shuffle();
        
        
    }
    
    /**
     * shuffle randomly distributes the 52 cards among the deck.
     */
    public void shuffle(){
        
        Random r = new Random();
        
        //swap 1000 cards
        for(int i = 1; i<1000; i++){
            //store index of Card1 to swap
            int swapNum = r.nextInt(DECK_SIZE-1);
            //store value of Card1 to swap
            Object swap = this.get().get(swapNum);

            //store index of Card2 to swap
            int swapNum2 = r.nextInt(DECK_SIZE-1);
            //store value of Card2 to swap
            Object temp = this.get().get(swapNum2);

            //move card 1 to location of card2
            this.get().add(swapNum2, ((Card)swap));
            this.get().remove(swapNum2+1);
            

            //move card2 to location of card1
            this.get().add(swapNum,((Card)temp));
            this.get().remove(swapNum+1);
            
            
        }
    }
    
    /**
     * deal method deals the requested number of cards from the deck into a hand and returns that hand. 
     * @param num
     * @return 
     */
    public Hand deal(int num){
        
        //initialize empty queue for hand
        Hand h = new Hand();
        
        //populate hand 
        for (int i = 0; i < num; i++){
            h.enqueue(this.get().get(0));
            this.get().remove(0);
        }
        
        return h;
    }
        
}
