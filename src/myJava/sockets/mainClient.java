package myJava.sockets;

public class mainClient {
	public static void main(String args[]){
		new Thread(new Client()).start();
		new Thread(new ClientScanner()).start();
	}
}
