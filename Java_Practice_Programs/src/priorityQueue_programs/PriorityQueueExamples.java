/**
 * 
 */
package priorityQueue_programs;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class PriorityQueueExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {

			// Task 1: Write a Java program to create a new priority queue, add some colors
			// (string) and print out the elements of the priority queue.
			PriorityQueue<String> colors = new PriorityQueue<>();
			System.out.println("How many colors you want to insert: ");
			int element = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter " + element + " colors: ");
			for (int i = 0; i < element; i++) {
				colors.add(scanner.nextLine());
			}
			System.out.println(colors);

			//

		}
	}

}
