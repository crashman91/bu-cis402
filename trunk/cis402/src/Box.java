/**
 * 
 * @author Andrei Tolnai
 * @date 02 April 2010
 * @assignment 3.2
 * @description Create a class named Box that includes integer data fields for
 *              length, width, and height. Create three constructors that
 *              require one, two, and three arguments, respectively. When one
 *              argument is used, assign it to length, assign zeros to height
 *              and width, and print "Line created". When two arguments are
 *              used, assign them to length and width, assign zero to height,
 *              and print "Rectangle created". When three arguments are used,
 *              assign them to the three variables and print "Box created". Save
 *              your files as Box.java and TestBox.java.
 * @company Bellevue University
 * @fileName Box.java
 * 
 */
@SuppressWarnings("unused")
public class Box {

	private int length;
	private int width;
	private int height;

	/**
	 * Creates a line.
	 * 
	 * @param length
	 */
	public Box(int length) {
		this.length = length;
		this.width = 0;
		this.height = 0;
		System.out.println("Line created");
	}

	/**
	 * Creates a rectangle.
	 * 
	 * @param length
	 * @param width
	 */
	public Box(int length, int width) {
		this.length = length;
		this.width = width;
		this.height = 0;
		System.out.println("Rectangle created");
	}

	/**
	 * Creates a box.
	 * 
	 * @param length
	 * @param width
	 * @param height
	 */
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("Box created");
	}

}