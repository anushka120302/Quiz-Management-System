import java.awt.*;  
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;  
  
class OnlineTest extends JFrame implements ActionListener  
{  
	
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest(String s)  
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
                b2.setEnabled(true);
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
            l.setText("Que1: Who is the father of cloud computing?");  
            jb[0].setText("Sharon B. Codd");jb[1].setText("Edgar Frank Codd");jb[2].setText("J.C.R. Licklider");jb[3].setText("Charles Bachman");   
        }  //c
        if(current==1)  
        {  
            l.setText("Que2:  Which of the following is a type of cloud computing service?");  
            jb[0].setText("Service-as-a-Software (SaaS)");jb[1].setText(" Software-and-a-Server (SaaS)");jb[2].setText("Software-as-a-Service (SaaS)");jb[3].setText("Software-as-a-Server (SaaS)");  
        }  //a
        if(current==2)  
        {  
            l.setText("Que3: Which of the following is the application of cloud computing?");  
            jb[0].setText("Adobe");jb[1].setText("Paypal");jb[2].setText("Google G Suite");jb[3].setText("All of the above");  
        }	//  d
        if(current==3)  
        {  
            l.setText("Que4: Which of the following is an example of the cloud?");  
            jb[0].setText("Amazon Web Services (AWS)");jb[1].setText("Dropbox");jb[2].setText(" Cisco WebEx");jb[3].setText("All of the above");  
        } // a
        if(current==4)  
        {  
            l.setText("Que5:  Model that attempts to categorize a cloud network based on four dimensional factors?");  
            jb[0].setText("Cloud Cube");jb[1].setText("Cloud Square");jb[2].setText("Cloud Service");jb[3].setText("All of the above");  
        }  //c
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[2].isSelected());  
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[3].isSelected());  
        if(current==4)  
            return(jb[0].isSelected());   
        return false;  
    }  
     
}  