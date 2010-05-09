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
 * @fileName DemoAccounts.java
 * 
 */
public class DemoAccounts {

	public static void main(String args[]) {

		Savings savings = new Savings(457246, 2.1);
		savings.setAccountBalance(9300);
		savings.displayAccountNumber();
		savings.displayAccountBalance();
		savings.displayInterestRate();

		Checking checking = new Checking(9124123);
		checking.setAccountBalance(7000);
		checking.displayAccountNumber();
		checking.displayAccountBalance();
	}

}