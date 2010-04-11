import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 11 April 2010
 * @assignment 4.2
 * @description Write an application for a furniture company; the program
 *              determines the price of a table. Ask the user to choose 1 for
 *              pine, 2 for oak, or 3 for mahogany. The output is the name for
 *              the wood chosen as well as the price of the table. Pine tables
 *              cost $100, oak tables cost $225, and mahogany tables cost $310.
 *              If the user enters an invalid wood code, set the price to 0.
 *              Save your file as Furniture.java.
 * @company Bellevue University
 * @fileName Furniture.java
 * 
 */
public class Furniture {

	// Constants with the price for table for each wood.
	private static final int PINE_WOOD_TABLE_PRICE = 100;
	private static final int OAK_WOOD_TABLE_PRICE = 225;
	private static final int MAHOGANY_WOOD_TABLE_PRICE = 310;

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

		switch (option) {
		case 1:
			printTableInformation("pine", PINE_WOOD_TABLE_PRICE);
			break;
		case 2:
			printTableInformation("oak", OAK_WOOD_TABLE_PRICE);
			break;
		case 3:
			printTableInformation("mahogany", MAHOGANY_WOOD_TABLE_PRICE);
			break;
		default:
			System.out.println("Please select 1, 2 or 3.");
			break;
		}
	}

	/**
	 * Displays information about the table: wood and price.
	 * 
	 * @param wood
	 * @param price
	 */
	private static void printTableInformation(String wood, int price) {
		System.out.println("Wood chosen: " + wood + "; Table price: $" + price);
	}

}