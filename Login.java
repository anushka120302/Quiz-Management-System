import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
public class Login extends JFrame implements ActionListener
{
	
	JLabel one,two;
	JTextField user,pass;
	JButton b1,b2,b3;

     
	Login() 
	{
	    
		one=new JLabel("User Name");
		user=new JTextField(20);
		two=new JLabel("Password");
		pass=new JTextField(20);
		b1=new JButton("Check");
		b2=new JButton("Reset");
		b3=new JButton("!!!!!!!");
		one.setBounds(20,20,80,80);
		two.setBounds(20,80,180,80);
		user.setBounds(100,40,170,40);
		pass.setBounds(100,100,170,40);
		b1.setBounds(50,150,100,40);
		b2.setBounds(180,150,100,40);
		b3.setBounds(300,150,100,40);
		//getContentPane().setBackground(Color.pink);  
        
		
		try {
		      setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("E:\\Downloads\\graphic era.jpg")))));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		
		
		//add(new JLabel(new ImageIcon("\"C:\\Users\\DELL\\Downloads\\IMG-20211029-WA0000.jpg\"")));
		b3.setBackground(Color.blue);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(one);
		add(user);
		add(two);
		add(pass);
		add(b1);
		add(b2);
		add(b3);
		pack();
		//setSize(500,500); // Setting size of JFrame
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		
	  String u1,p1;
	  u1=user.getText();
	  p1=pass.getText();
	  if(ae.getSource()==b1)
	  if(u1.equals("admin")&& p1.equals("geu"))
	  {
		  b3.setBackground(Color.green);
		  JOptionPane.showMessageDialog(this,"successful");
		  quizManagement a=new quizManagement();
		  a.selectSubject(a.showMenuOptions());
	  }
	  else  
	  {
		  b3.setBackground(Color.red);
		  JOptionPane.showMessageDialog(this,"Unsuccessful");
		  
	  }
	  if(ae.getSource()==b2)
	  {
		  user.setText("");
		  pass.setText("");
		  b3.setBackground(Color.blue);
		  user.setRequestFocusEnabled(true);	  
	  }
	  
	}
	public static void main(String args[])
    {
    	new Login();
    }

}
