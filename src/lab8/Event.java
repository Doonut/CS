/* Name: Kyle Casey
 * Date: 3/22/15
 * Program: Event Project 4B
 * Desc: create constructor and methods to grab values from private variables
 */

package lab8;

public class Event {
	private char eventType;
	private double eventMinRate;
	public Event(char event, double rate){
		eventType = event;
		eventMinRate = rate;
	}
	public char getEventType(){
		return eventType;
	}
	public double getEventMinRate(){
		return eventMinRate;
	}
}
