import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class quizManagement{
	
	public static int showMenuOptions()
	{
		String[] options = {"Cloud Computing", "Cryptography"};

	    int x = JOptionPane.showOptionDialog(null, "Select a subject for starting Quiz.",
	            "Quiz Management System",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	    
		return x;
    }
	
	public static void quiz1_cloud() {
		OnlineTest onlineTest=new OnlineTest("Quiz System");
		onlineTest.set();
	}
	public static void quiz2_cloud() {
		OnlineTest1 onlineTest1=new OnlineTest1("Quiz System");
		onlineTest1.set();
	}
	public static void quiz3_cloud() {
		OnlineTest2 onlineTest2=new OnlineTest2("Quiz System");
		onlineTest2.set();
	}
	public static void quiz4_cloud() {
		OnlineTest3 onlineTest3=new OnlineTest3("Quiz System");
		onlineTest3.set();
	}
	public static void quiz5_crypto() {
		OnlineTest4 onlineTest4=new OnlineTest4("Quiz System");
		onlineTest4.set();
	}
	public static void quiz6_crypto() {
		OnlineTest5 onlineTest5=new OnlineTest5("Quiz System");
		onlineTest5.set();
	}
	public static void quiz7_crypto() {
		OnlineTest6 onlineTest6=new OnlineTest6("Quiz System");
		onlineTest6.set();
	}
	public static void quiz8_crypto() {
		OnlineTest7 onlineTest7=new OnlineTest7("Quiz System");
		onlineTest7.set();
	}
	
	
	public static void showQuizzez_cloud() {
		String[] options = {"Quiz1", "Quiz2", "Quiz3", "Quiz4"};

	    int x = JOptionPane.showOptionDialog(null, "Select a Quiz number for starting Quiz.",
	            "Quiz Management System",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	    boolean run = true;
        while(run){
            switch (x){
                case 0:
                    quiz1_cloud();
                    run=false;
                    break;

                case 1:
                	quiz2_cloud();
                    run=false;
                    break;
                case 2:
                	quiz3_cloud();
                    run=false;
                    break;
                case 3:
                	quiz4_cloud();
                    run=false;
                    break;

                default:
                	run=false;
                    JOptionPane.showMessageDialog(null, "Invalid option selected");

            }//end of switch block

        } //end of while
		
	}
	public static void showQuizzez_crypto() {
		String[] options = {"Quiz1", "Quiz2", "Quiz3", "Quiz4"};

	    int x = JOptionPane.showOptionDialog(null, "Select a Quiz number for starting Quiz.",
	            "Quiz Management System",
	            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	    boolean run = true;
        while(run){
            switch (x){
                case 0:
                    quiz5_crypto();
                    run=false;
                    break;

                case 1:
                	quiz6_crypto();
                    run=false;
                    break;
                case 2:
                	quiz7_crypto();
                    run=false;
                    break;
                case 3:
                	quiz8_crypto();
                    run=false;
                    break;

                default:
                	run=false;
                    JOptionPane.showMessageDialog(null, "Invalid option selected");
                    
            }//end of switch block

        } //end of while
		
	}
	 
    public static void selectSubject(int x){

        boolean run = true;
        while(run){
            switch (x){
                case 0:
                    showQuizzez_cloud();
                    run=false;
                    break;

                case 1:
                	showQuizzez_crypto();
                	run=false;
                    break;

                default:
                	run=false;
                    JOptionPane.showMessageDialog(null, "Invalid option selected");
                    
            }//end of switch block

        } //end of while
    }
}
	
	
	/*public static void main(String args[]) 
	{ 
		
	    Login l=new Login();
	    
	    
	    	
		selectSubject(showMenuOptions());
	}
}*/
