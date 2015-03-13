package myJava.sockets;

import java.io.*;
import java.net.*;
public class Client implements Runnable{
	Socket requestSocket;
	static ObjectOutputStream out;
 	ObjectInputStream in;
 	public static String inMessage;
 	public static boolean canRun = false;
 	String outMessage;
	Client(){}
	public void run()
	{
		try{
			//1. creating a socket to connect to the server
			requestSocket = new Socket("localhost", 2004);
			System.out.println("Connected to localhost in port 2004");
			//2. get Input and Output streams
			out = new ObjectOutputStream(requestSocket.getOutputStream());
			out.flush();
			in = new ObjectInputStream(requestSocket.getInputStream());
			//3: Communicating with the server
			do{
				try{
					inMessage = (String)in.readObject();
					System.out.println("server>" + inMessage);
				}
				catch(ClassNotFoundException classNot){
					System.err.println("data received in unknown format");
				}
			canRun = true;
			}while(!inMessage.equals("bye"));
		}
		catch(UnknownHostException unknownHost){
			System.err.println("You are trying to connect to an unknown host!");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Closing connection
			try{
				in.close();
				out.close();
				requestSocket.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	public static void sendMessage(String msg)
	{
		try{
			out.writeObject(msg);
			out.flush();
			System.out.println("client>" + msg);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
}