package myJava.sockets;

import java.util.Scanner;

public class ClientScanner implements Runnable {
	public void run(){
		String outMessage;
		Scanner input = new Scanner(System.in);
		do{
			if (Client.canRun == true){
				outMessage = input.nextLine(); 
				Client.sendMessage(outMessage);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(true);
	}
}
