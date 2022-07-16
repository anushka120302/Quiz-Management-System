import java.awt.*;  
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;  
  
class OnlineTest7 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest7(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        getContentPane().setBackground(Color.pink);
        b1=new JButton("Next");  
        
        b1.addActionListener(this);  
        
        add(b1); 
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set(); 
            
            if(current==4)  
            {  
            	b2=new JButton("Result");
            	add(b2);   
            	b2.addActionListener(this); 
                b2.setBounds(270,240,100,30);  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Caesar Cipher is an example of?");  
            jb[0].setText("Poly-alphabetic Cipher");jb[1].setText("Bi-alphabetic Cipher");jb[2].setText("Multi-alphabetic Cipher");jb[3].setText(" Mono-alphabetic Cipher");   
        } //d 
        if(current==1)  
        {  
            l.setText("Que2: An asymmetric-key cipher uses?");  
            jb[0].setText("1-key");jb[1].setText("2-key");jb[2].setText("3-key");jb[3].setText("4-key");  
        }  //b
        if(current==2)  
        {  
            l.setText("Que3:  The shift cipher is sometimes referred to as the?");  
            jb[0].setText("Cipher");jb[1].setText("Shift Cipher");jb[2].setText("Caesar Cipher");jb[3].setText("Cipher Text");  
        }  //c
        if(current==3)  
        {  
            l.setText("Que4: The substitutional ciphers are?");  
            jb[0].setText("bialphabetic");jb[1].setText("polyalphabetic");jb[2].setText("semi alphabetic");jb[3].setText("monoalphabatic");  
        }  //a
        if(current==4)  
        {  
            l.setText("Que5: Cryptography can provide?");  
            jb[0].setText(" Open Writing");jb[1].setText("Secret Writing");jb[2].setText("Closed Writing");jb[3].setText("Corrupting Data");  
        }  //d
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
        
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[3].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[2].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[3].isSelected());   
        return false;  
    }  
     
    
}  