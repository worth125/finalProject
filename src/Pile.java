import java.util.ArrayList;

/**
 *
 * @author Alec Ellsworth
 */
public class Pile {
    private ArrayList <Card> p;
    
    /*
     * default construction creates an empty arraylist of Cards
     */
    public Pile(){
        p = new ArrayList<Card>();
    }
    
    /**
     * Add method adds a card to the pile
     * @param c 
     */
    public void add(Card c){
        p.add(c);
    }
    
    /*
     * Remove method removes a card from the pile
     */
    public void remove(Card c){
        //check if pile contains card
        if (p.contains(c))
            p.remove(c);
    }
    
    /*
     * Get method returns the pile
     */
    public ArrayList get(){
        
        return p;
    }
    
    /*
     * isEmpty method tests if the pile is empty
     */
    public boolean isEmpty(){
        return p.isEmpty();
    }
    
    /*
     * toString prints the pile
     */
    public String toString(){
        return p.toString();
    }
    
    
}
