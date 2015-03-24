/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: Event.java
 * Desc: create constructor and methods to grab values from private variables
 */

package lab8;

public class Event { //start class Event
	private char eventType; //create private char
	private double eventMinRate; //create private double
	public Event(char event, double rate){ //start Event constructor
		eventType = event; //set private event type to event
		eventMinRate = rate; //set private min rate to rate
	} //end constructor
	public char getEventType(){ //start public char function getEventType()
		return eventType; //return private event type
	} //end getEventType()
	public double getEventMinRate(){ //start public double function getEventMinRate()
		return eventMinRate; //return private min rate
	} //end getEventMainRate()
} //end class
