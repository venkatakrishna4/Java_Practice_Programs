/**
 * It contains all the HashSet examples
 */
package hashSet_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author krish
 *
 */
public class HashSetExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hashSet = new HashSet<>();
		try (Scanner scanner = new Scanner(System.in)) {

			// Task 1: Write a Java program to append the specified element to the end of a
			// hash set.
			System.out.println("How many elements you want to insert: ");
			int element = scanner.nextInt();
			for (int i = 0; i < element; i++) {
				hashSet.add(scanner.nextInt());
			}

			// Task 2: Write a Java program to iterate through all elements in a hash list.
			Iterator<Integer> iterator = hashSet.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			// Task 3: Write a Java program to get the number of elements in a hash set.
			System.out.println(hashSet.size());

			// Task 4: Write a Java program to empty an hash set.
			hashSet.clear();
			System.out.println(hashSet);

			// Task 5: Write a Java program to test a hash set is empty or not.
			System.out.println(hashSet.isEmpty());

			// Task 6: Write a Java program to clone a hash set to another hash set.
			// Adding hard coded values
			hashSet.add(2);
			hashSet.add(5);
			hashSet.add(10);
			// Clone hashSet
			@SuppressWarnings("unchecked")
			HashSet<Integer> clonedHashSet = (HashSet<Integer>) hashSet.clone();
			System.out.println(clonedHashSet);

			// Task 7: Write a Java program to convert a hash set to an array.
			Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);
			for (Integer i : array) {
				System.out.print(i + " ");
			}

			// Task 8: Write a Java program to convert a hash set to a tree set.
			TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
			System.out.println(treeSet);

			// Task 9: Write a Java program to convert a hash set to a List/ArrayList
			ArrayList<Integer> list = new ArrayList<>(hashSet);
			System.out.println(list);

			// Task 10: Write a Java program to compare two hash set.
			// compare by values
			System.out.println(hashSet.equals(clonedHashSet));
			// compare by hash codes
			System.out.println(hashSet == clonedHashSet);

			// Task 11: Write a Java program to compare two sets and retain elements which
			// are same on both sets
			System.out.println(hashSet.retainAll(clonedHashSet));

			// Task 12: Write a Java program to remove all of the elements from a hash set.
			hashSet.removeAll(hashSet);
			System.out.println(hashSet);
		}
	}

}
