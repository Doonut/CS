package myJava.borasmom;

import java.awt.Color;
import java.util.Random;

import javax.swing.JTextArea;

public class Text implements Runnable {
	public void run(){
		Color color2 = new Color(0,0,0,0);
		JTextArea mainText = new JTextArea(5,20);
		mainText.setEditable(false);
		mainText.append("BUCKED FORAS MOM");
		mainText.setBackground(color2);
		mainText.setBounds(330,355,230,90);
		Random rand = new Random();
	while(true){
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color color = new Color(r,g,b);
		mainText.setForeground(color);
		color = null;
		MainWindow.frame.add(mainText);
		try {
		    Thread.sleep(100);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	}
}
