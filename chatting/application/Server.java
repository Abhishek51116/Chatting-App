
package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener {
    JPanel p1;
    JTextField t1;
    JButton b1;
    
    Server(){
    
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0,0,500,50);
        add(p1);
        
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/ICONS/3.png")); 
    Image i2 = i1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 = new JLabel(i3);
    l1.setBounds(5,5,30,30);
    p1.add(l1);
    
    l1.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent ae){
            System.exit(0);
        }
    });
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/ICONS/lucifer.jpg")); 
    Image i5 = i4.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel l2 = new JLabel(i6);
    l2.setBounds(40,0,60,60);
    p1.add(l2);
    
    JLabel l3 = new JLabel("Lucifer");
    l3.setFont(new Font("SAN_SERIF",Font.BOLD,20));
    l3.setForeground(Color.white);
    l3.setBounds(110,10,100,20);
    p1.add(l3);
    
    JLabel l4 = new JLabel("active");
    l4.setFont(new Font("SAN_SERIF",Font.ITALIC,14));
    l4.setForeground(Color.white);
    l4.setBounds(110,28,100,20);
    p1.add(l4);
    
    t1 = new JTextField();
    t1.setBounds(5,550,400,40);
    t1.setFont(new Font("SANS_SERIF",Font.BOLD,16));
    add(t1);
    
    setLayout(null);
    setSize(500,600);
    setLocation(400,200);    
    setUndecorated(true);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
    }
    
    public static void main(String[] args){
        new Server();
    }
}
