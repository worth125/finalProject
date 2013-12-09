import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author Alec Ellsworth
 */
public class ImageHandle extends JFrame{

    private JButton button;
    private JLabel pic;
    private ImageIcon front, back;
    
    public ImageHandle(String s){
        super(s);
        setLayout(new FlowLayout());
        button = new JButton("flip");
        button.addActionListener(new ButtonListener());
        add(button);
        
        front = new ImageIcon("aces.jpg");
        back = new ImageIcon("back.jpg");
        
        pic = new JLabel(back);
        add(pic);
    }
    
    class ButtonListener implements ActionListener{ //an inner clas has access to all the private data that it is defined within
        public void actionPerformed(ActionEvent e){
            
            if (pic.getIcon() == front)
                pic.setIcon(front);
            else
                pic.setIcon(back);
        }
    }
}
