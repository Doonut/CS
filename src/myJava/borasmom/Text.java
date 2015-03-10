package myJava.borasmom;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JTextArea;

public class Text implements Runnable {
	public void run(){
		Color color2 = new Color(0,0,0,0);
		
		JTextArea mainText = new JTextArea();
		mainText.setEditable(false);
		mainText.append("BUCKED FORAS MOM");
		mainText.setBackground(color2);
		Font f = mainText.getFont();
		Font f2 = new Font(f.getFontName(), f.getStyle(), f.getSize()+10);
		mainText.setFont(f2);
		
		Random rand = new Random();
		
	while(true){
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		int x = rand.nextInt((500 - 10) + 1) + 10;
		int y = rand.nextInt((700 - 100) + 1) + 100;
		mainText.setBounds(x,y,240,90);
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
