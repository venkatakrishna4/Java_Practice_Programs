/**
 * 
 */
package treeSet_programs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author krish
 *
 */
public class TreeSetExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {

			// Task 1: Write a Java program to create a new tree set, add some colors
			// (string) and print out the tree set.
			TreeSet<String> colors = new TreeSet<>();
			System.out.println("How many colors you want to insert: ");
			int element = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter all " + element + " colors: ");
			for (int i = 0; i < element; i++) {
				colors.add(scanner.nextLine());
			}
			System.out.println(colors);

			// Task 2: Write a Java program to iterate through all elements in a tree set
			Iterator<String> iterator = colors.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			// Task 3: Write a Java program to add all the elements of a specified tree set
			// to another tree set.
			TreeSet<String> newTreeSet = new TreeSet<>();
			newTreeSet.addAll(colors);
			System.out.println(newTreeSet);

			// Task 4: Write a Java program to create a reverse order view of the elements
			// contained in a given tree set
			System.out.println(colors.descendingSet());

			// Task 5: Write a Java program to get the first and last elements in a tree
			// set.
			System.out.println(colors.first());
			System.out.println(colors.last());

			// Task 6: Write a Java program to clone a tree set list to another tree set.
			@SuppressWarnings("unchecked")
			TreeSet<String> clonedTreeSet = (TreeSet<String>) colors.clone();
			System.out.println(clonedTreeSet);

			// Task 7: Write a Java program to get the number of elements in a tree set.
			System.out.println(colors.size());

			// Task 8: Write a Java program to compare two tree sets
			// compare by values
			System.out.println(colors.equals(clonedTreeSet));
			// compare by hash codes
			System.out.println(colors == clonedTreeSet);

			// Task 9: Write a Java program to find the numbers less than 7 in a tree set.
			TreeSet<Integer> treeSet = new TreeSet<>();
			treeSet.add(10);
			treeSet.add(1);
			treeSet.add(444);
			treeSet.add(5);
			treeSet.add(88);
			for (Integer i : treeSet) {
				if (i < 7)
					System.out.print(i + " ");
			}

			// Task 10: Write a Java program to get the element in a tree set which is
			// greater than or equal to the given element.
			for (Integer i : treeSet) {
				if (i >= 7) {
					System.out.print(i + " ");
				}
			}

			// Task 11: Write a Java program to get the element in a tree set which is less
			// than or equal to the given element.
			System.out.println(treeSet.floor(5));

			// Task 12: Write a Java program to get the element in a tree set which is
			// strictly greater than or equal to the given element.
			System.out.println(treeSet.higher(7));

			// Task 13: Write a Java program to get an element in a tree set which is
			// strictly less than the given element.
			System.out.println(treeSet.lower(7));

			// Task 14: Write a Java program to retrieve and remove the first element of a
			// tree set.
			System.out.println(treeSet.pollFirst());

			// Task 15: Write a Java program to retrieve and remove the last element of a
			// tree set.
			System.out.println(treeSet.pollLast());

			// Task 16: Write a Java program to remove a given element from a tree set
			System.out.println("Which element you want to remove: ");
			element = scanner.nextInt();
			System.out.println(treeSet.remove(element));
		}
	}

}
