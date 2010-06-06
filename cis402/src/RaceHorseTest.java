/**
 * 
 * @author Andrei Tolnai
 * @date 06 June 2010
 * @assignment 12.3
 * @description Create a class named RaceHorse that extends Thread. Each
 *              RaceHorse has a name and a run() method that displays the name
 *              50 times. Write an application that instantiates 5 RaceHorse
 *              objects each with different names, executing in their own
 *              Thread. The last RaceHorse to finish is the loser.
 * @company Bellevue University
 * @fileName RaceHorseTest.java
 * 
 */
public class RaceHorseTest {

	public static void main(String args[]) {

		new RaceHorse("Haleb").start();
		new RaceHorse("Lexington").start();
		new RaceHorse("Chewy").start();
		new RaceHorse("Icarus").start();
		new RaceHorse("Howler").start();

	}
}