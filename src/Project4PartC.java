/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: Event.java
 * Desc: create constructor and methods to grab values from private variables
 */

public class Project4PartC { //start class Event
	private static final double CORP_RATE = 75.99;
	private static final double PRI_RATE = 47.99;
	private char eventType; //create private char
	private double eventMinRate; //create private double
	public Project4PartC(char event, double rate){ //start Event constructor
		eventType = event; //set private event type to event
		eventMinRate = rate; //set private min rate to rate
	} //end constructor
	
	public Project4PartC(char event){
		eventType = event;
		if (eventType == 'C' || eventType == 'c'){
			eventMinRate = CORP_RATE;
		}
		else if (eventType == 'P' || eventType == 'p'){
			eventMinRate = PRI_RATE;
		}
	}
	public char getEventType(){ //start public char function getEventType()
		return eventType; //return private event type
	} //end getEventType()
	public double getEventMinRate(){ //start public double function getEventMinRate()
		return eventMinRate; //return private min rate
	} //end getEventMainRate()
} //end class
