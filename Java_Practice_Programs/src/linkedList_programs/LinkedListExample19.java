/**
 * Write a Java program to remove and return the first element of a linked list.
 */
package linkedList_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class LinkedListExample19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {
			// Creating LinkedList
			LinkedList<Integer> linkedList = new LinkedList<>();

			// Read the size of the ArrayList
			int sizeOfArrayList = scanner.nextInt();
			scanner.nextLine();

			// Read colors from user
			for (int i = 0; i < sizeOfArrayList; i++) {
				linkedList.add(scanner.nextInt());
			}

			// Task: Remove and return the first element
			try {
				System.out.println(linkedList.remove(1));
				System.out.println(linkedList);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("--------------------Displaying output using for loop--------------------");
			// UseCase 1: Iterate using for loop
			for (int i = 0; i < linkedList.size(); i++) {
				System.out.println(linkedList.get(i));
			}

			System.out.println("--------------------Displaying output using advanced for loop--------------------");
			// UseCase 2: Iterate using advanced for loop
			for (Integer i : linkedList) {
				System.out.println(i);
			}

			System.out.println("--------------------Displaying output using forEach loop--------------------");
			// UseCase 3: Iterate using forEach loop
			linkedList.forEach(color -> {
				System.out.println(color);
			});

			System.out.println("--------------------Displaying output using Iterator--------------------");
			// UseCase 4: Iterate using Iterator
			Iterator<Integer> iterator = linkedList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

}
