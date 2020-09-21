
package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends JFrame implements ActionListener {
    JPanel p1;
    JTextField t1;
    JButton b1;
    static JTextArea a1;
    static ServerSocket skt;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public Server(){
    
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
    
    a1 = new JTextArea();
    a1.setBounds(0, 51,500 , 498);
    a1.setForeground(Color.white);
    a1.setBackground(Color.BLACK);
    a1.setFont(new Font("SANS_SERIF",Font.BOLD,16));
    a1.setEditable(false);
    a1.setLineWrap(true);
    a1.setWrapStyleWord(true);
    add(a1);
    
    t1 = new JTextField();
    t1.setBounds(5,550,400,40);
    t1.setFont(new Font("SANS_SERIF",Font.BOLD,16));
    add(t1);
    
    b1 = new JButton("SEND");
    b1.setBounds(410,550,80,40);
    b1.setBackground(new Color(7, 94, 84));
    b1.setForeground(Color.white);
    b1.addActionListener(this);
    add(b1);
    
    setLayout(null);
    setSize(500,600);
    setLocation(600,00);    
    setUndecorated(true);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       
       
        try {
            String out = t1.getText();
            t1.setText("");
            a1.setText(a1.getText() + "\n\t\t\t" + out);
           
                dout.writeUTF(out);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    public static void main(String[] args){
        new Server();
        String msgInput = "";
        try{
            skt = new ServerSocket(6001);
            s = skt.accept();
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            while(true){
            msgInput = din.readUTF();
            a1.setText(a1.getText()+ "\n" + msgInput);
            }
            skt.close();
            s.close();
            
        }catch(Exception e){}
        
    }
    
    
}
