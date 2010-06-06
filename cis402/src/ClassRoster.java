import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Andrei Tolnai
 * @date 15 May 2010
 * @assignment 9.2
 * @description Create a class named Student that includes String data fields
 *              for firstName and lastName. Create a constructor that requires
 *              two String parameters to populate the firstName and lastName
 *              fields. Create a LinkedList of 20 Student objects each having
 *              different first and last names. Print your LinkedList, first in
 *              the order your items were placed onto the LinkedList and then in
 *              reverse order. Save your files as Student.java and
 *              ClassRoster.java.
 * @company Bellevue University
 * @fileName ClassRoster.java
 * 
 */
public class ClassRoster {

	public static void main(String args[]) {

		List<Student> classRoster = new LinkedList<Student>();
		classRoster.add(new Student("Giordano", "Barahona"));
		classRoster.add(new Student("Benjamin", "Brown"));
		classRoster.add(new Student("Joseph", "Crum"));
		classRoster.add(new Student("Santhi", "Darsipudi"));
		classRoster.add(new Student("Robert", "Davis"));
		classRoster.add(new Student("Rameswarapu", "Deepak"));
		classRoster.add(new Student("Christopher", "Dehaan"));
		classRoster.add(new Student("David", "Gore"));
		classRoster.add(new Student("Sherry", "Haley"));
		classRoster.add(new Student("Joseph", "Hooper"));
		classRoster.add(new Student("Iyad", "Kanafani"));
		classRoster.add(new Student("Mohan", "Karki"));
		classRoster.add(new Student("Sanath", "Mahathantila"));
		classRoster.add(new Student("Robert", "McGovern"));
		classRoster.add(new Student("Danny", "Ortiz"));
		classRoster.add(new Student("Chandu", "Peram"));
		classRoster.add(new Student("Maddumage", "Perera"));
		classRoster.add(new Student("Richard", "Rogers"));
		classRoster.add(new Student("Matt", "Sampson"));
		classRoster.add(new Student("Danny", "Sangili"));
		classRoster.add(new Student("Ramesh", "Ortiz"));

		System.out.println("The order the students were placed in the list:");
		for (Student student : classRoster) {
			System.out.println(student);
		}

		System.out.println("\nThe reverse order:");
		for (int i = classRoster.size() - 1; i >= 0; i--) {
			System.out.println(classRoster.get(i));
		}
	}

}