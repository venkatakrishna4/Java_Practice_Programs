/**
 * Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */
package linkedList_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class LinkedListExample3 {

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

			// Task: Iterate through LinkedList from specific index
			try {
				System.out.println("Iterate from: ");
				int index = scanner.nextInt();

				System.out.println("--------------------Displaying output using for loop--------------------");
				// UseCase 1: Iterate using for loop
				for (int i = index; i < sizeOfArrayList; i++) {
					System.out.println(linkedList.get(i));
				}

				System.out.println("--------------------Displaying output using Iterator--------------------");
				// UseCase 4: Iterate using Iterator
				Iterator<Integer> iterator = linkedList.listIterator(index);
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
