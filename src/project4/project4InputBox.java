package project4;

/***********************
* Name: Kyle Casey
* Date: 3/7/15
* Program: Project4InputBox.java
* Desc: Create swing frame and decide user's choice of corporate or private manager.
*/

import java.awt.Color; //import javax, awt, and other packages
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class project4InputBox { //start class
	static final String corprateManager = "Dustin Britt"; //set corprateManager
	static final String privateManager = "Carmen Lindsey"; //set privateManager
	static String inputString; //create string for input
	static JTextArea outputText = new JTextArea(); //create outputText TextArea
	static boolean printedText = false; //create boolean to call ActionListener once
	static final Color defaultColor = new Color(238,238,238); //set default javax color
	public void createGUI() { //start function
		JFrame frame = new JFrame("Event scheduler"); //create main frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make program close on exit
		frame.setLayout(null); //set no layout for absolute positioning
		
		outputText.setEditable(false); //set output text not editable
		outputText.setBounds(5,160,300,40); //set rectangle where object is located
		outputText.setBackground(defaultColor); //set background to default color to match javax
		
		JTextArea mainText = new JTextArea(5,20); //create mainText area to print directions
		mainText.setEditable(false); //set text not editable
		mainText.append("Enter Type of event you are scheduling.\n\n"); //append program directions
		mainText.append("C for a corporate event.\n");
		mainText.append("P for a private event.");
		mainText.setBounds(5,5,230,90); //set rectangle where object is located
		mainText.setBackground(defaultColor); //set background to default color to match javax
		
		MaskFormatter mf = null; //initialize MaskFormatter variable
		try {
			mf = new MaskFormatter("U"); //create object and set it to only allow upper case characters
			mf.setValidCharacters("CP"); //set C and P as valid characters to be entered
		} catch (ParseException e) { //catch ParseException if exists to make compiler happy
			// TODO Auto-generated catch block
			e.printStackTrace() //print error report
		;} //end catch
		
		JFormattedTextField textInput = new JFormattedTextField(mf); //create textInput with MaskFormatter
		textInput.setBounds(5,110,30,31); //set rectangle where object is located
		
		JButton enterButton = new JButton("Enter"); //create enter button
		enterButton.setBounds(40,110,100,30); //set rectangle where object is located
		enterButton.addActionListener(new ActionListener() { //create Action listener
            public void actionPerformed(ActionEvent e){ //on ActionEvent Clicked...
            	inputString = textInput.getText(); //get text of textInput box
            	if (inputString.charAt(0) == 'C' || inputString.charAt(0) == 'P' && printedText == false){ //if variable exists and if statement hasnt ran
            		if (inputString.charAt(0) == 'C'){ //if selected input is corporate
            			outputText.append("The manager for this event will be " + corprateManager + "."); //print corporate manager
            		}
            		else{ //else if selected input is private
            			outputText.append("The manager for this event will be " + privateManager + "."); //print private manager
            		} //end if-else nest
            		printedText = true; //set to true to disable future runs
            	} //end  if
            } //end action function
        }); //end ActionListener
		
		frame.add(mainText); //add mainText to frame
		frame.add(textInput); //and textInput to frame
		frame.add(enterButton); //add enterButton to frame
		frame.add(outputText); //add outputText to frame
		frame.setSize(300,220); //set frame size
		frame.setResizable(false); //make frame non-resizable
		frame.setVisible(true); //make frame visible
	}
}