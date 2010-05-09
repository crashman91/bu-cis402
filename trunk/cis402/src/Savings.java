/**
 * 
 * @author Andrei Tolnai
 * @date 09 May 2010
 * @assignment 8.2
 * @description Create an abstract class named Account for a bank. Include an
 *              integer field for the account number and a double field for the
 *              account balance. Also include a constructor that requires an
 *              account number and that sets the balance to 0.0. Include a set
 *              method for the balance. Also include two abstract display
 *              methods--one for each field. Create two child classes of
 *              Account: Checking and Savings. Within the Checking class, the
 *              display method displays the String
 *              "Checking Account Information", the account number, and the
 *              balance. Within the Savings class, add a field to hold the
 *              interest rate and require the Savings constructor to accept an
 *              argument for the value of the interest rate. The Savings display
 *              method displays the String "Savings Account Information", the
 *              account number, the balance, and the interest rate. Write an
 *              application that demonstrates you can instantiate and display
 *              both Checking and Savings objects. Save your files as
 *              Account.java, Checking.java, Savings.java, and
 *              DemoAccounts.java.
 * @company Bellevue University
 * @fileName Savings.java
 * 
 */
public class Savings extends Account {

	/**
	 * The interest rate.
	 */
	double interestRate;

	/**
	 * Initializes the savings with the provided account number and interest
	 * rate. The savings account balance is set to 0.
	 * 
	 * @param accountNumber
	 * @param interestRate
	 */
	public Savings(int accountNumber, double interestRate) {
		super(accountNumber);
		this.interestRate = interestRate;
	}

	@Override
	public void displayAccountBalance() {
		System.out.println("Saving Account Information. Account balance: " + accountBalance);
	}

	@Override
	public void displayAccountNumber() {
		System.out.println("Saving Account Information. Account number: " + accountNumber);
	}

	/**
	 * Displays the interest rate.
	 */
	public void displayInterestRate() {
		System.out.println("Saving Account Information. Interest rate: " + interestRate);
	}

}