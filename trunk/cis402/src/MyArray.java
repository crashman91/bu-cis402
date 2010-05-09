/**
 * @author Andrei Tolnai
 * @date 1 May 2010
 * @assignment 7.2
 * @description Create an application containing an array that stores 20 double
 *              values, such as 2.34, 7.89, 1.34, and so on. (Deliverable 1) The
 *              application should:
 *              <ul>
 *              <li>Display the sum of all the array elements
 *              <li>Display the average of all the array elements
 *              <li>
 *              Display the largest value of all the array elements
 *              </ul>
 *              Save your file as MyArray.java.
 * @company Bellevue University
 * @fileName MyArray.java
 * 
 */
public class MyArray {

	/**
	 * The array that stores 20 double values.
	 */
	static double[] doubles = { 2.34, 7.89, 1.34, 4.22, 1.71, 3.14, 1.5, 7.23,
			4.54, 1.2, 5.82, 9.64, 4.77, 8.65, 2.21, 6.44, 7.02, 5.53, 3.52,
			4.22 };

	public static void main(String args[]) {
		displaySum();
		displayAverage();
		displayTheLargestValue();
	}

	/**
	 * Displays the sum of the double array.
	 */
	public static void displaySum() {

		// initialize the sum with 0
		double sum = 0.0;

		// iterate through all the array elements
		for (int i = 0; i < doubles.length; i++) {

			// add up each element to the sum variable
			sum += doubles[i];
		}

		// display the sum
		System.out.println("The sum is: " + sum);
	}

	/**
	 * Displays the average of the double array.
	 */
	public static void displayAverage() {

		// initialize the sum with 0
		double sum = 0.0;

		// iterate through all the array elements
		for (int i = 0; i < doubles.length; i++) {

			// add up each element to the sum variable
			sum += doubles[i];
		}

		// display the average by dividing the sum to the length of the array
		System.out.println("The average is: " + sum / doubles.length);
	}

	/**
	 * Displays the largest value from the double array.
	 */
	public static void displayTheLargestValue() {

		// initialize the largest value with the first element
		double largestValue = doubles[0];

		// iterate through the remaining elements (ignore the first)
		for (int i = 1; i < doubles.length; i++) {

			// check if "i" element is greater then the current largest value
			if (doubles[i] > largestValue) {
				largestValue = doubles[i];
			}
		}

		// display the largest value
		System.out.println("The largest value is: " + largestValue);
	}

}