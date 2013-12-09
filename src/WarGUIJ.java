import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Alec Ellsworth
 */
public class WarGUI extends JFrame{
    
    //games
    private WarGame w;
    
    //panels
    private JPanel topPanel,//for label
     gamePanel, //game container
     centerPanel, //for game play
     leftPanel, //for player1 deck
     rightPanel; //for player2 deck
     
         
    //buttons
    private JButton startButton; //start button
    private JButton playButton; //play button
    
    //Labels
    private JLabel status; //game status
    private JLabel title; //game title
    private JLabel cardBack; //card back label
    private JLabel left, right, //cards face down
            card1, card2, //cards face up
            p1Total, //cards remaining for player 1
            p2Total; //cards remaining for player 2
    
    //pics
    private ImageIcon back; //card back image
    private ImageIcon cardPic1, cardPic2; //card front images
    
    
    public WarGUI(){
        //create war game
        w = new WarGame();
        
        //set and customize top panel
        topPanel = new JPanel(); 
        topPanel.setBackground(Color.green);
        
        //set and customize game panel
        gamePanel = new JPanel(new BorderLayout());
        gamePanel.setBackground(Color.yellow);
        
        //set player deck images
         leftPanel = new JPanel(new BorderLayout()); //create separate panel for left pane
         rightPanel = new JPanel(new BorderLayout()); //create separate panel for right pane
         back = new ImageIcon("back.jpg"); //set back of card image
// 
//         
//         //put images into labels
         left = new JLabel(back); //make left label into card back image
         right = new JLabel(back); //make right label into card back image
//         
//         //place labels in player panels
         leftPanel.add(left, BorderLayout.CENTER); //add card back image to center pane of left panel
         rightPanel.add(right, BorderLayout.CENTER); //add card back image to center pane of right panel
// 
//         //get hand sizes
         int i1 = w.getHand(1).size();
         int i2 = w.getHand(2).size();
//         
//         //Turn hand sizes into labels
         String s1 = "Player 1 Card Total: " + i1;
         String s2 = "Player 2 Card Total: " + i2;
         p1Total = new JLabel(s1);
         p2Total = new JLabel(s2);
//         
//         //place labels in top of player panels
         leftPanel.add(p1Total, BorderLayout.NORTH);
         rightPanel.add(p2Total, BorderLayout.NORTH);
//         
//         //place player panels on game panel
         gamePanel.add(leftPanel, BorderLayout.WEST); //add left panel to left pane of game board
         gamePanel.add(rightPanel, BorderLayout.EAST); //add right panel to right pane of game board
//         
//         //create, register and add start button
         startButton = new JButton("Play Round");
         startButton.addActionListener(new StartButtonListener());
        centerPanel = new JPanel();
        centerPanel.setBackground(Color.red);
        centerPanel.add(startButton);
//         //create labels for cards
         cardPic1 = new ImageIcon("2h.jpg");
         cardPic2 = new ImageIcon("4s.jpg");
         card1 = new JLabel(cardPic1);
         card2 = new JLabel(cardPic2);
         centerPanel.add(card1);
         centerPanel.add(card2);
//         
         gamePanel.add(centerPanel, BorderLayout.CENTER);  //add button to gamePanel
//         
//         //set and add title pane
         title = new JLabel("The Game of War");
         title.setFont(new Font("HELVETICA",Font.ITALIC,36));
         topPanel.add(title);
         add(topPanel, BorderLayout.NORTH);
        
                
        //display panels to the frame's content pane
        add(gamePanel);  
        
        
}
    //handle start button
    private class StartButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            //centerPanel.removeAll(); 
            //centerPanel.validate();
            
            //set card labels to card images
            Card c1 = (Card)w.getHand(1).peek(); //get card from player 1
            Card c2 = (Card)w.getHand(2).peek(); //get card from player 2
            cardPic1 = c1.getImage(); //get card 1 image
            cardPic2 = c2.getImage(); //get card 2 image
            card1.setIcon(cardPic1); 
            card2.setIcon(cardPic2);
            
            //add card images to center panel
            //centerPanel.add(card1);
            //centerPanel.add(card2);
            
            //update game panel
            //gamePanel.add(centerPanel, BorderLayout.CENTER);
            gamePanel.validate();
            
            //back = new ImageIcon("back.jpg"); //bring in back of card image
            //cardBack = new JLabel(back); //set image to label
            
            //JLabel left = new JLabel("Left");
            //JLabel right = new JLabel("Right");
            
            //gamePanel.add(left, BorderLayout.WEST);
            //gamePanel.add(right, BorderLayout.EAST);
            //add(gamePanel);
            /*
            //display back of card on both sides of game board
            gamePanel.add(cardBack, BorderLayout.WEST); 
            gamePanel.add(cardBack, BorderLayout.EAST);
            add(gamePanel);
            */
            
           
        }

       
    }
        
}
    
    
    
    

