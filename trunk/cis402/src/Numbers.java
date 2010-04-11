/**
 * @author Andrei Tolnai
 * @date 28 March 2010
 * @assignment 2.2
 * @description Create an application named Numbers whose main() method holds
 *              two integer variables. Assign values to the variables. Pass both
 *              values to methods named sum() and difference(). Create the
 *              methods sum() and difference(); then compute the sum and
 *              difference between the values of two arguments, respectively.
 *              Each method should perform the appropriate computation and
 *              display the results. Save the application as Numbers.java.
 * @company Bellevue University
 * @fileName Numbers.java
 * 
 */
public class Numbers {

	public static void main(String[] args) {
		int numberOne = 10;
		int numberTwo = 14;

		sum(numberOne, numberTwo);
		difference(numberOne, numberTwo);
	}

	/**
	 * Calculates the sum of the two parameters. </br> It displays the sum and
	 * returns the sum.
	 * 
	 * @param param1
	 * @param param2
	 * @return the sum of <code>param1</code> and <code>param2</code>
	 */
	public static int sum(int param1, int param2) {
		int sum = param1 + param2;
		System.out.println(param1 + " + " + param2 + " = " + sum);
		return sum;
	}

	/**
	 * Calculates the difference of the two parameters. </br> It displays the
	 * difference and returns the difference.
	 * 
	 * @param param1
	 * @param param2
	 * @return <code>param1</code> - <code>param2</code>
	 */
	public static int difference(int param1, int param2) {
		int difference = param1 - param2;
		System.out.println(param1 + " - " + param2 + " = " + difference);
		return difference;
	}

}