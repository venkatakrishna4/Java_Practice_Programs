/**
 * Write a Java program to insert elements into the linked list at the first and last position.
 */
package linkedList_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class LinkedListExample6 {

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

			// Task: Insert an element at the first and last
			try {
				System.out.println("Element to be inserted at first: ");
				int first = scanner.nextInt();
				System.out.println("Element to be inserted at last: ");
				int last = scanner.nextInt();
				linkedList.addFirst(first);
				linkedList.addLast(last);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("--------------------Displaying output using for loop--------------------");
			// UseCase 1: Iterate using for loop
			for (int i = 0; i < sizeOfArrayList; i++) {
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
