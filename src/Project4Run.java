/* Name: Kyle Casey
 * Date: 3/28/15
 * Program: Project4Run.java
 * Desc: Create Project4 Objects and show output
 */

public class Project4Run {
	public static void main(String[] args){
	Project4PartC object1 = new Project4PartC('c');
	Project4PartC object2 = new Project4PartC('p');
	System.out.println("The Corperation rate in object 1 is: " + object1.getEventMinRate());
	System.out.println("The Private rate in object 2 is: " + object2.getEventMinRate());
	}
}
