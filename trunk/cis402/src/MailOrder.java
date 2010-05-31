import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Andrei Tolnai
 * @date 30 May 2010
 * @assignment 11.2
 * @description Write an application for a mail order company. The program uses
 *              a data entry screen in which the user types an item number and a
 *              quantity. Write each record to a file. Save your file as
 *              MailOrder.java.
 * @company Bellevue University
 * @fileName MailOrder.java
 * 
 */
public class MailOrder {

	/**
	 * Path to the file where the records will be saved.
	 */
	public static final String FILE_PATH = "mail_order.txt";

	public static void main(String args[]) {

		final JButton addButton = new JButton("Add record to file");
		final JButton exitButton = new JButton("Exit");

		final JLabel itemNumberLabel = new JLabel("Item Number: ");
		final JTextField itemNumberText = new JTextField(6);

		final JLabel quantityLabel = new JLabel("Quantity: ");
		final JTextField quantityText = new JTextField(6);

		// The action listener for the buttons
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exitButton) {
					// The exit button

					System.exit(0);
				} else if (e.getSource() == addButton) {
					// The add button

					// Flag indicating if the item number and quantity were
					// valid integers.
					boolean ok = true;

					int itemNumber = 0;
					int quantity = 0;

					try {
						itemNumber = Integer.parseInt(itemNumberText.getText());
					} catch (NumberFormatException nfe) {
						ok = false;
						JOptionPane.showMessageDialog(null, "You must enter a valid integer for the item number!", "Error", JOptionPane.ERROR_MESSAGE);
					}

					try {
						quantity = Integer.parseInt(quantityText.getText());
					} catch (NumberFormatException nfe) {
						ok = false;
						JOptionPane.showMessageDialog(null, "You must enter a valid integer for the quantity!", "Error", JOptionPane.ERROR_MESSAGE);
					}

					if (ok) {
						writeToFile(itemNumber, quantity, itemNumberText, quantityText);
					}

				}
			}

		};

		// Add the action listener to the buttons
		addButton.addActionListener(actionListener);
		exitButton.addActionListener(actionListener);

		// Panel for item number label and text
		JPanel itemNumberPanel = new JPanel(new FlowLayout());
		itemNumberPanel.add(itemNumberLabel);
		itemNumberPanel.add(itemNumberText);

		// Panel for quantity label and text
		JPanel quantityPanel = new JPanel(new FlowLayout());
		quantityPanel.add(quantityLabel);
		quantityPanel.add(quantityText);

		// Panel for the add and exit buttons
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(addButton);
		buttonPanel.add(exitButton);

		// Create the JFrame
		JFrame frame = new JFrame();

		// Set the BorderLayout for the JFrame
		frame.setLayout(new BorderLayout());

		// Add the panels to the frame
		frame.add(itemNumberPanel, BorderLayout.NORTH);
		frame.add(quantityPanel, BorderLayout.CENTER);
		frame.add(buttonPanel, BorderLayout.SOUTH);

		// Set to exit the program when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the width and height of the frame
		frame.setSize(300, 150);

		frame.setResizable(false);

		// Show the frame
		frame.setVisible(true);
	}

	/**
	 * Writes to the file the item number and quantity. On success a
	 * confirmation dialog is presented and the input texts are reseted. On
	 * error, an error dialog is displayed.
	 * 
	 * @param itemNumber
	 * @param quantity
	 * @param itemNumberText
	 * @param quantityText
	 */
	private static void writeToFile(int itemNumber, int quantity, JTextField itemNumberText, JTextField quantityText) {

		// Create the file object.
		File file = new File(FILE_PATH);

		try {

			// Create a file writer that will append to the file.
			FileWriter fileWriter = new FileWriter(file, true);

			// Create the buffered writer.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Write a record made of item number an quantity.
			bufferedWriter.write(itemNumber + "\t" + quantity + "\n");

			// Close the buffered writer stream.
			bufferedWriter.close();

			// Display a confirmation dialog
			JOptionPane.showMessageDialog(null, "The record was saved to the file.");

			// Reset the input texts
			itemNumberText.setText("");
			quantityText.setText("");

		} catch (Exception e) {

			// Display the error.
			JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

}