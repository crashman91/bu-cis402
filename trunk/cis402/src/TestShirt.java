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
 * @fileName TestShirt.java
 * 
 */
public class TestShirt {

	public static void main(String[] args) {
		Shirt firstShirt = new Shirt(10, 14);
		Shirt secondShirt = new Shirt(14, 24);
		Shirt thirdShirt = new Shirt(23, 19);

		System.out.println("First shirt: " + firstShirt);
		System.out.println("Second shirt: " + secondShirt);
		System.out.println("Third shirt: " + thirdShirt);
	}

}