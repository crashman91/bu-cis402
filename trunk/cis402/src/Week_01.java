/**
 * @author Andrei Tolnai
 * @date 21 March 2010
 * @assignment 1.2
 * @description Write a class that declares a variable named
 *              <code>minutes</code>, which holds minutes worked on a job, and
 *              assign a value. Display the value in hours and minutes; for
 *              example, 197 minutes becomes 3 hours and 17 minutes. </br>Save
 *              the class as Week_01.java.
 * @company Bellevue University
 * @fileName Week_01.java
 * 
 */
public class Week_01 {

	/**
	 * Global static variable that holds the minutes worked on a job.
	 */
	static long minutes;

	public static void main(String args[]) {

		// assigning a value to the global static variable
		minutes = 197;

		// displaying the value of the global static variable
		System.out.println("Minutes: " + minutes);

		// displaying the value in hours and minutes
		System.out.println(minutes / 60 + " hours and " + minutes % 60 + " minutes.");
	}

}