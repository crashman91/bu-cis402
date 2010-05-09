import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 25 April 2010
 * @assignment 6.2
 * @description Write an application that counts the total number of vowels
 *              contained in a String entered by the user. Save you file as
 *              CountVowels2.java. (Deliverable 2)
 * @company Bellevue University
 * @fileName CountVowels2.java
 * 
 */
public class CountVowels2 {

	/**
	 * Array with the vowels (lower case letters)
	 */
	private static final char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {

		System.out.print("Enter a string: ");

		Scanner userInput = new Scanner(System.in);

		// string entered by the user
		String aString = userInput.next();

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