/**
 * 
 * @author Andrei Tolnai
 * @date 02 April 2010
 * @assignment 3.2
 * @description Create a class named Shirt with data fields for collar size and
 *              sleeve length. Include a constructor that takes arguments for
 *              each field. Also include a static String variable named material
 *              and initialize it to "cotton". Write an application named
 *              TestShirt to instantiate three Shirt objects with different
 *              collar sizes and sleeve lengths, and then display all the data,
 *              including material, for each shirt. Save your files as
 *              Shirt.java and TestShirt.java.
 * @company Bellevue University
 * @fileName Shirt.java
 * 
 */
public class Shirt {

	private int collarSize;
	private int sleeveLength;
	private static String material = "cotton";

	/**
	 * Creates a shirt with the specified parameters and cotton material.
	 * 
	 * @param collarSize
	 * @param sleeveLength
	 */
	public Shirt(int collarSize, int sleeveLength) {
		this.collarSize = collarSize;
		this.sleeveLength = sleeveLength;
	}

	/**
	 * Returns a string representation of the object. </br> It includes
	 * information abut the collar size, sleeve length and material.
	 */
	public String toString() {
		return "collarSize:" + collarSize + ", sleeveLength:" + sleeveLength + ", material:" + material + ".";
	}

}