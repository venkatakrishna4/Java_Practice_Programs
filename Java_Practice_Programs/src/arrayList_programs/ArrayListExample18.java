/**
 * Write a Java program to test an array list is empty or not.
 */
package arrayList_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class ArrayListExample18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in);) {

			// Create an ArrayList
			ArrayList<String> colors = new ArrayList<>();

			// Read the size of the ArrayList
			int sizeOfArrayList = scanner.nextInt();
			scanner.nextLine();

			// Read colors from user
			for (int i = 0; i < sizeOfArrayList; i++) {
				colors.add(scanner.nextLine());
			}

			// Task: Check ArrayList is empty or not
			try {
				System.out.println(colors.isEmpty());
				colors.removeAll(colors);
				System.out.println(colors.isEmpty());
			} catch (IndexOutOfBoundsException ioe) {
				ioe.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("--------------------Displaying output using for loop--------------------");
			// UseCase 1: Iterate using for loop
			for (int i = 0; i < sizeOfArrayList; i++) {
				System.out.println(colors.get(i));
			}

			System.out.println("--------------------Displaying output using advanced for loop--------------------");
			// UseCase 2: Iterate using advanced for loop
			for (String i : colors) {
				System.out.println(i);
			}

			System.out.println("--------------------Displaying output using forEach loop--------------------");
			// UseCase 3: Iterate using forEach loop
			colors.forEach(color -> {
				System.out.println(color);
			});

			System.out.println("--------------------Displaying output using Iterator--------------------");
			// UseCase 4: Iterate using Iterator
			Iterator<String> iterator = colors.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

}
