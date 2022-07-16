import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest1 extends JFrame implements ActionListener  
{  
	quizManagement q;
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest1(String s)  
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
        l.setBounds(100,100,450,100);  
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
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
          //  q.selectSubject(q.showMenuOptions());
            System.exit(0);  
        }  
    }  
    void set()  
    {  
    	jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Which of the following cloud concept is related to pooling of resources?");  
            jb[0].setText("Polymorphism");jb[1].setText("Abstraction");jb[2].setText("Virtualization");jb[3].setText("None of the above");   
        }  //a
        if(current==1)  
        {  
            l.setText("Que2: Which of the following can be identified as cloud?");  
            jb[0].setText("Web Applications");jb[1].setText("Hadoop");jb[2].setText("Intranet");jb[3].setText("All of the mentioned");  
        }  //b
        if(current==2)  
        {  
            l.setText("Que3: Which of the following is Cloud Platform by Amazon?");  
            jb[0].setText("Azure");jb[1].setText("AWS");jb[2].setText("Cloudera");jb[3].setText("All of the mentioned");  
        }  //b
        if(current==3)  
        {  
            l.setText("Que4: Which one of the following can be considered as a utility is a dream?");  
            jb[0].setText("Computing");jb[1].setText("Model");jb[2].setText("Software");jb[3].setText("All of the mentioned");  
        }  //c
        if(current==4)  
        {  
            l.setText("Que5: By whom is the backend commonly used?");  
            jb[0].setText("Client");jb[1].setText("Service Provider");jb[2].setText("Stockholders");jb[3].setText("User");  
        }  //b
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[2].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[1].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[1].isSelected());   
        return false;  
    }  
     
}  