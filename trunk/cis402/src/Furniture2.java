import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 11 April 2010
 * @assignment 4.2
 * @description Add a prompt to the above application to ask the user to specify
 *              a (1) large or (2) small table. Add $35 to the price of any
 *              large table. Save your file as Furniture2.java.
 * @company Bellevue University
 * @fileName Furniture2.java
 * 
 */
public class Furniture2 {

	// Constants with the price for table for each wood.
	private static final int PINE_WOOD_TABLE_PRICE = 100;
	private static final int OAK_WOOD_TABLE_PRICE = 225;
	private static final int MAHOGANY_WOOD_TABLE_PRICE = 310;

	// Large table additional cost.
	private static final int LARGE_TABLE = 35;

	public static void main(String[] args) {
		System.out.println("Select wood for the table: ");
		System.out.println("  [1] pine");
		System.out.println("  [2] oak");
		System.out.println("  [3] mahogany");

		byte option = 0;
		Scanner userInput = new Scanner(System.in);
		try {
			option = userInput.nextByte();
		} catch (InputMismatchException e) {
			// In the case the user does not enter a number
			System.out.println("You must enter a number.");

			// Exit the program
			System.exit(1);
		}

		if (option != 1 && option != 2 && option != 3) {
			System.out.println("Please select 1, 2 or 3.");

			// Exit the program
			System.exit(1);
		}

		System.out.println("Select table dimension: ");
		System.out.println("  [1] small");
		System.out.println("  [2] large");

		byte tableDimension = 0;
		userInput = new Scanner(System.in);
		try {
			tableDimension = userInput.nextByte();
		} catch (InputMismatchException e) {
			// In the case the user does not enter a number
			System.out.println("You must enter a number.");

			// Exit the program
			System.exit(1);
		}

		if (tableDimension != 1 && tableDimension != 2) {
			System.out.println("Please select [1]small or [2]large for the table dimension.");

			// Exit the program
			System.exit(1);
		}

		switch (option) {
		case 1:
			printTableInformation("pine", PINE_WOOD_TABLE_PRICE, tableDimension);
			break;
		case 2:
			printTableInformation("oak", OAK_WOOD_TABLE_PRICE, tableDimension);
			break;
		case 3:
			printTableInformation("mahogany", MAHOGANY_WOOD_TABLE_PRICE, tableDimension);
			break;
		}
	}

	/**
	 * Displays information about the table: wood and price.
	 * 
	 * @param wood
	 * @param price
	 * @param tableDimension
	 */
	private static void printTableInformation(String wood, int price, byte tableDimension) {
		System.out.println("Wood chosen: " + wood + "; Table price: $" + (price + (tableDimension == 2 ? LARGE_TABLE : 0)));
	}

}