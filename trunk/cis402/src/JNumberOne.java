import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * @author Andrei Tolnai
 * @date 1 May 2010
 * @assignment 7.2
 * @description Create a JApplet with a JButton labeled "Who's number one?" When
 *              the user clicks the button, display your favorite sports team.
 *              Save your file as JNumberOne.java. (Deliverable 2)
 * @company Bellevue University
 * @fileName JNumberOne.java
 * 
 */
public class JNumberOne extends JApplet implements ActionListener {

	/**
	 * Serial version ID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The contentPane object for this applet.
	 */
	private Container container = getContentPane();

	/**
	 * The JButton.
	 */
	private JButton button = new JButton("Who's number one?");

	/**
	 * The JLabel.
	 */
	private JLabel label = new JLabel("Steaua");

	// //////////////////////////////////////////////////////////////////
	//
	// The content of the HTML file for the applet:
	// <html><object code="JNumberOne.class" width=200 height=50/></html>
	//
	// //////////////////////////////////////////////////////////////////

	public void init() {

		// set the layout to FlowLayout
		container.setLayout(new FlowLayout());

		// register the 'this' action listener for the button
		button.addActionListener(this);

		// add the button to the contentPane of this applet
		container.add(button);
	}

	public void actionPerformed(ActionEvent actionEvent) {

		// remove the button from the contentPane of this applet
		container.remove(button);

		// add the label to the contentPane of this applet
		container.add(label);

		repaint();
		validate();
	}

}