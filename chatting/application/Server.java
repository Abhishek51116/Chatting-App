
package chatting.application;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    JPanel p1;
    
    Server(){
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0,0,500,50);
        add(p1);
        
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/ICONS/arrow.jpg")); 
    Image i2 = i1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 = new JLabel(i3);
    l1.setBounds(5,5,30,30);
    p1.add(l1);
    
    
    
    setLayout(null);
    setSize(500,600);
    setLocation(400,200);
    setVisible(true);
    }
    
    public static void main(String[] args){
        new Server();
    }
}
