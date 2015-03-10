package myJava.borasmom;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class MainWindow implements Runnable {
	public static JFrame frame = new JFrame("Bora's Mom BETA: 0.5");
	
	public void run() {
		
		Random rand = new Random();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(800, 800);
		
		while(true)
		{
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color color = new Color(r,g,b);
			frame.getContentPane().setBackground(color);
			color = null;
			
			try {
			    Thread.sleep(100);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
		}
	}
}

