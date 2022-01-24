/**
 * Write a Java program to create a new array list, add some colors (string) and print out the collection.
 */
package collection_framework_programs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author krish
 *
 */
public class ArrayListExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating Scanner object to read values from user
		try(Scanner scanner = new Scanner(System.in);){
			
			// Create an ArrayList
			ArrayList<String> colors = new ArrayList<>();
			
			// Read the size of the ArrayList
			int sizeOfArrayList = scanner.nextInt();scanner.nextLine();
			
			// Read colors from user
			for(int i = 0; i < sizeOfArrayList; i++) {
				colors.add(scanner.nextLine());
			}
			
			// Print the ArrayList to the output screen
			System.out.println(colors);
		}
	}

}
