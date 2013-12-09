
/**
 *
 * @author Alec Ellsworth
 */
public class WarGame {
    
    //variables
    private Pile p;
    private Deck d;
    private Hand h1;
    private Hand h2;
    
    /**
     * default constructor creates a new deck and deals 2 hands
     */
    public WarGame(){
        d = new Deck();
        d.shuffle();
        h1 = d.deal(26);
        h2 = d.deal(26);
    }
    
    /**
     * getHand method returns hand 1 or hand 2
     * @param n
     * @return 
     */
    public Hand getHand(int n){
        Hand h = null;
        if (n==1){
            h = h1;
        }
        else if (n == 2){
            h = h2;
        }
        else {
            System.out.println("There are only two hands: 1 and and 2.");
        }
        return h;
    }
    
    /**
     * play method plans 1 round of the game
     * @return 
     */    
    public int play(){
        int winner = 0; //for return
        
        //play a card from each hand if neither hand is empty
        if(!this.h1.isEmpty() && !this.h2.isEmpty()){
            
            
            Card c1 = ((Card)h1.dequeue());
            Card c2 = ((Card)h2.dequeue());
            
            //player 1 wins case
            if(c1.getRank() > c2.getRank()){
                h1.enqueue(c1);
                h1.enqueue(c2);
                winner = 1;
            }
            //player 2 wins case
            else if(c1.getRank() < c2.getRank()){
                h2.enqueue(c1);
                h2.enqueue(c2);
                winner = 2;
            }
            //war case
            else
                winner = war(h1, h2);
        }
        //player 1 hand empty case
        if(h1.isEmpty()){
            System.out.println("Player 1 loses");
            System.exit(0);
        }
        //player 2 hand empty case
        else if(h2.isEmpty()){
            System.out.println("Player 2 loses");
            System.exit(0);
        }
        
        return winner;
    }
    
    /**
     * war method carries out a war
     * @param h1
     * @param h2
     * @return 
     */
    public int war(Hand h1, Hand h2){
        int winner = 0;
        
        //if neither hand is empty, put two cards face down
        if(!h1.isEmpty() && !h2.isEmpty()){
            Card down1 = (Card)h1.dequeue();
            Card down2 = (Card)h2.dequeue();
            
            //if neither hand is empty, put two cards face up
            if(!h1.isEmpty() && !h2.isEmpty()){
                Card up1 = (Card)h1.dequeue();
                Card up2 = (Card)h2.dequeue();
                
                //player 1 wins case
                if(up1.getRank() > up2.getRank()){
                    h1.enqueueMulti(down1, down2, up1, up2);
                    winner = 1;
                }
                //player 2 wins case
                else if(up1.getRank() < up2.getRank()){
                    h2.enqueueMulti(down1, down2, up1, up2);
                    winner = 2;
                }
                //war again case
                else if(up1.getRank() == up2.getRank()){
                    winner = war(h1, h2);
                }
            }
            //player 1 empty hand during war case
            else if(h1.isEmpty()){
                System.out.println("Player 1 loses");
                System.exit(0);
                }
            //player 2 empty hand during war case
            else if(h2.isEmpty()){
                System.out.println("Player 2 loses");
                System.exit(0);
            }
        }
        //player 1 empty hand before war case
        else if(h1.isEmpty()){
            System.out.println("Player 1 loses");
            System.exit(0);
        }
        //player 2 empty hand before war case
        else if(h2.isEmpty()){
            System.out.println("Player 2 loses");
            System.exit(0);
        }
        
        return winner;
    }
}
