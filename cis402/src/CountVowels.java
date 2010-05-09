/**
 * 
 * @author Andrei Tolnai
 * @date 25 April 2010
 * @assignment 6.2
 * @description Write an application that counts the total number of vowels
 *              contained in the String
 *              "Event Handlers is dedicated to making your event a most memorable one."
 *              Save your file as CountVowels.java. (Deliverable 1)
 * @company Bellevue University
 * @fileName CountVowels.java
 * 
 */
public class CountVowels {

	/**
	 * Array with the vowels (lower case letters)
	 */
	private static final char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {

		// the string on which the vowel count will be performed
		String aString = "Event Handlers is dedicated to making your event a most memorable one.";

		// variable that will hold the number of vowels in the indicated string
		int numberOfVowels = 0;

		// transform the string to lower case
		aString = aString.toLowerCase();

		// variable that will hold each character from the string
		char letter;

		for (int i = 0; i < aString.length(); i++) {
			letter = aString.charAt(i);

			// compare the letter with each of the vowels
			for (int j = 0; j < vowels.length; j++) {

				if (letter == vowels[j]) {
					// a vowel was found
					numberOfVowels++;

					// exit the inner for loop
					break;
				}
			}
		}

		// display the total number of vowels found in the string
		System.out.println("Total number of vowels: " + numberOfVowels);

	}

}