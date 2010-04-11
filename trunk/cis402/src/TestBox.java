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
 * @fileName TestBox.java
 * 
 */
@SuppressWarnings("unused")
public class TestBox {

	public static void main(String[] args) {
		Box line = new Box(10);
		Box rectangle = new Box(10, 5);
		Box box = new Box(10, 5, 15);
	}

}