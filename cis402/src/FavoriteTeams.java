import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Andrei Tolnai
 * @date 17 May 2010
 * @assignment 10.2
 * @description Create a JFrame and set the layout to BorderLayout. Place a
 *              JButton containing the name of a sports team in each region
 *              (north, east, south, and west). Add a JLabel to the center
 *              region. When the user clicks a JButton, set the text of the
 *              JLabel to the team the Jbutton selected represents. Save your
 *              file as FavoriteTeams.java.
 * @company Bellevue University
 * @fileName FavoriteTeams.java
 * 
 */
public class FavoriteTeams extends JFrame {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -4833137698862539762L;

	public FavoriteTeams(){
		// Create the buttons.
		JButton northButton = new JButton("Steaua");
		JButton southButton = new JButton("Dinamo");
		JButton westButton = new JButton("Poli Timisoara");
		JButton eastButton = new JButton("UTA");

		// Create the label.
		JLabel centerText = new JLabel();

		
		setLayout(new BorderLayout());

		// Add the buttons and the label to the frame.
		add(northButton, BorderLayout.NORTH);
		add(southButton, BorderLayout.SOUTH);
		add(westButton, BorderLayout.WEST);
		add(eastButton, BorderLayout.EAST);
		add(centerText, BorderLayout.CENTER);
		
	}
	public void showFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		FavoriteTeams favoriteTeamsFrame = new FavoriteTeams();
		favoriteTeamsFrame.showFrame();
		
	}
}