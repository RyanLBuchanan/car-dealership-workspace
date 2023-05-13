// Import the necessary package(s)
package ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			// Create a File object for the file "myFile.txt"
			File file = new File("myFile.txt");

			// Create a Scanner object to read the contents of the file
			Scanner input;

			input = new Scanner(file);

			// Read the file line by line using a while loop
			while (input.hasNextLine()) {
				// Read the current line and print it to the console
				String line = input.nextLine();
				System.out.println(line);
			}

			// Close the Scanner object to free up resources
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
//			e.printStackTrace();
		}
		

		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(9));
		} catch (Exception e) {
			System.out.println("Number is too small");
//			e.printStackTrace();
		}

//		for (int i = 0; i <= 3; i++) {
//		// create a new Scanner object to read input from the console
//		Scanner input = new Scanner(System.in);
//		
//		// prompt the user to enter some text
//		System.out.println("Enter some text: ");
//		
//		// read the text that the user enters
//		String enteredText = input.nextLine();
//		
//		// print out the text that the user entered
//		System.out.println(enteredText);
//		}
		
	}

}
