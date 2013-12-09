
import javax.swing.JFrame;



/**
 *
 * @author Alec Ellsworth
 */
public class Tester {

    public static void main(String[] args){
        
        //demonstrate pile
        Pile p = new Pile();
        System.out.println(p);
        
        //demo deck class
        Deck d = new Deck();
        System.out.println(d);
        
        //demo shuffle
        d.shuffle();
        System.out.println(d);
        
        //demo hand
        Hand h1 = d.deal(26);
        System.out.println(h1);
        System.out.println(d.get().size());
        
        //demo hand
        Hand h2 = d.deal(26);
        System.out.println(h2);
        System.out.println(d.get().size());
        
        //demo hand size
        System.out.println("Hand 1 Size: " + h1.size());
        System.out.println("Hand 2 Size: " + h2.size());
        
        JFrame frame = new WarGUI();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.validate();
       //frame.pack();
        frame.setVisible(true);
        
    }
    

}
