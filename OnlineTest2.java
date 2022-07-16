import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest2 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest2(String s)  
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
            l.setText("Que1: Which of the following provides GUI for interaction with the cloud?");  
            jb[0].setText("Client");jb[1].setText("Applicatioin ");jb[2].setText("Client Infrastructure");jb[3].setText("Server");   
        }  //c
        if(current==1)  
        {  
            l.setText("Que2: Which of the following has features of cloud computing?");  
            jb[0].setText("Web Service");jb[1].setText("Software");jb[2].setText("All of the mentioned");jb[3].setText("Internet");  
        }  //d
        if(current==2)  
        {  
            l.setText("Que3: Which of the following is an essential concept related to Cloud?");  
            jb[0].setText("Reliability");jb[1].setText("Abstraction");jb[2].setText("Productivity");jb[3].setText("All mentioned");  
        }  //a
        if(current==3)  
        {  
            l.setText("Que4: Which one of the following is Cloud Platform by Amazon?");  
            jb[0].setText("AWS");jb[1].setText("Azure");jb[2].setText("Cloudera");jb[3].setText("All Mentoned");  
        }  //a
        if(current==4)  
        {  
            l.setText("Que5:Model that involves the services that user can access on Cloud Computing platform?");  
            jb[0].setText("Service");jb[1].setText("Planning");jb[2].setText("Deployment");jb[3].setText("Application");  
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
            return(jb[3].isSelected());  
        if(current==2)  
            return(jb[1].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[0].isSelected());   
        return false;  
    }  
     
}  