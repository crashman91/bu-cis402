/**
 * 
 * @author Andrei Tolnai
 * @date 15 May 2010
 * @assignment 9.2
 * @description Create a class named Student that includes String data fields
 *              for firstName and lastName. Create a constructor that requires
 *              two String parameters to populate the firstName and lastName
 *              fields. Create a LinkedList of 20 Student objects each having
 *              different first and last names. Print your LinkedList, first in
 *              the order your items were placed onto the LinkedList and then in
 *              reverse order. Save your files as Student.java and
 *              ClassRoster.java.
 * @company Bellevue University
 * @fileName Student.java
 * 
 */
public class Student {

	/**
	 * The fist name.
	 */
	private String firstName;

	/**
	 * The last name.
	 */
	private String lastName;

	/**
	 * Constructs a student with the first and the last name.
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Returns the string representation of the student; it includes the first
	 * and the last name.
	 */
	public String toString() {
		return firstName + " " + lastName;
	}

	/**
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}