import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest6 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest6(String s)  
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
            l.setText("Que1: In asymmetric key cryptography, the private key is kept by?");  
            jb[0].setText(" Sender");jb[1].setText("Receiver");jb[2].setText("Sender and Receiver");jb[3].setText("all the connected devices to the network");   
        }  //d
        if(current==1)  
        {  
            l.setText("Que2: In cryptography, the order of the letters in a message is rearranged by?");  
            jb[0].setText("transpositional ciphers");jb[1].setText("substitution ciphers");jb[2].setText("both transpositional ciphers and substitution ciphers");jb[3].setText("quadratic ciphers");  
        }  //a
        if(current==2)  
        {  
            l.setText("Que3: What is data encryption standard (DES)?");  
            jb[0].setText("block cipher");jb[1].setText("stream cipher");jb[2].setText("bit cipher");jb[3].setText("byte cipher");  
        }  //c
        if(current==3)  
        {  
            l.setText("Que4: Cryptanalysis is used:");  
            jb[0].setText("to find some insecurity in a cryptographic scheme");jb[1].setText("to increase the speed");jb[2].setText("to encrypt the data");jb[3].setText("to make new ciphers");  
        }  //c
        if(current==4)  
        {  
            l.setText("Que5:  When plain text is converted to unreadable format, it is termed as?");  
            jb[0].setText(" rotten text");jb[1].setText("cipher text");
            jb[2].setText("ciphen-text");jb[3].setText("raw text");  
        }  //a  
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[0].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[1].isSelected());   
        return false;  
    }  
     
}  