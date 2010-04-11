/**
 * @author Andrei Tolnai
 * @date 28 March 2010
 * @assignment 2.2
 * @description Create an application that calculates and displays the weekly
 *              salary for an employee who earns $25 an hour, works 40 regular
 *              hours, and 13 overtime hours, and earns time and one-half (wage
 *              * 1.5 for overtime hours worked). Create a separate method to do
 *              the calculation and return the result to the main() method to be
 *              displayed. Save the program as Salary.java.
 * @company Bellevue University
 * @fileName Salary.java
 * 
 */
public class Salary {

	public static void main(String[] args) {
		System.out.println("Employee salary: " + calculateSalary(25, 40, 13));
	}

	/**
	 * Calculates the salary of the employee.
	 * 
	 * @param wagePerHour
	 * @param regularHours
	 * @param overtimeHours
	 * @return the salary of the employee based on the following formula:
	 *         <p>
	 *         <code>wagePerHour * regularHours + wagePerHour * 1.5 * overtimeHours</code>
	 *         </p>
	 */
	public static double calculateSalary(int wagePerHour, int regularHours, int overtimeHours) {
		return wagePerHour * regularHours + wagePerHour * 1.5 * overtimeHours;
	}

}