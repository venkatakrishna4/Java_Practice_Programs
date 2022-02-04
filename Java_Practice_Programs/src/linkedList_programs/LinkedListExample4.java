/**
 * Write a Java program to iterate a linked list in reverse order.
 */
package linkedList_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class LinkedListExample4 {

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

			// Task: Iterate elements in reverse order

			System.out.println("--------------------Displaying output using for loop--------------------");
			// UseCase 1: Iterate using for loop
			for (int i = sizeOfArrayList - 1; i >= 0; i--) {
				System.out.println(linkedList.get(i));
			}

			System.out.println("--------------------Displaying output using Iterator--------------------");
			// UseCase 4: Iterate using Iterator
			Iterator<Integer> iterator = linkedList.descendingIterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		}
	}

}
