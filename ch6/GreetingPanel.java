//ProjectName: GreetingPanel

//Description: greeting panel



package ch6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GreetingPanel extends JPanel {
	   
	   private JLabel questionLabel;  
	   private JTextField answerTextField;
	   private JButton button;
	   private JLabel niceMessageLabel;
	   private JCheckBox Bold;
	     

	 	//Constructor:  Sets up the Panel  
	   public GreetingPanel()
	   {
			
			//create all the panel components
			
	        
		    button = new JButton("Press Here!");
		    button.setFont (new Font ("Helivetica", Font.PLAIN,20));
		    answerTextField = new JTextField();
		    questionLabel = new JLabel("Whats your name");
		    questionLabel.setFont(new Font ("Helivetica", Font.PLAIN,18));
		    niceMessageLabel = new JLabel();
			
			//add all the components to panel.  order is important
		   
		    add(questionLabel);
		    add(answerTextField);
		    add(button); 
		    add(niceMessageLabel);
		    
		   
	        //connect event handler to event source
	        button.addActionListener(new ButtonListener());
	        answerTextField.setPreferredSize(new Dimension(80, 20));
	        //niceMessageLabel.setPreferredSize(new Dimension(50, 20));
					
			//configure panel.  
	        setBackground(Color.LIGHT_GRAY);
	        setPreferredSize(new Dimension(170, 200));
		  
	   }

	   //private internal class that is a listener for button push (action) events.
		//also called an event handler
		private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	   //get the name the user put in the answerTextField
	    	   
	    	   
	    	   String text = answerTextField.getText();
	    	   
	    	   //now set the text of the niceMessageLabel
	    	   niceMessageLabel.setText("Hello, " + text) ;
	    	   //to a nice message that includes the name 
	    	   
	    	   niceMessageLabel.setFont (new Font ("Helivetica", Font.PLAIN,20));
               niceMessageLabel.setForeground(Color.green);

				  
				  
	      }//end of ActionPerformed method
			
	   }//end of ButtonListener
		
	}//end of GreetingPanel


