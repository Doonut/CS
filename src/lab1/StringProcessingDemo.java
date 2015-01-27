/*******************
 * Name: Kyle Casey
 * Date: 01/24/15
 * Desc: Simple program manipulating strings.
 */
package lab1;

public class StringProcessingDemo { //start of class
	public static void main(String[] args) //start of main function
	{
		String sentence = "I hate text processing!"; //set sentence to a string
		int position = sentence.indexOf("hate"); //find index of where hate is in the sentence
		String ending = sentence.substring(position + "hate".length()); //Grab string of words after hate in sentence string
		
		System.out.println("01234567890123456789012"); //print array positions of sentence string
		System.out.println(sentence); //print original sentence
		System.out.println("The word \"hate\" starts at index " + position); //show where the word hates index is
		sentence = sentence.substring(0, position) + "adore" + ending; //replace hate with adore in the string
		System.out.println("The changed string is:");
		System.out.println(sentence); // Print changed string
	} //end of main function
} //end of class