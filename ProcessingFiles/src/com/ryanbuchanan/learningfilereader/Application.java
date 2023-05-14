package com.ryanbuchanan.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt"); // create a File object with the name of the file to be read
//		BufferedReader bufferedReader = null; // initialize a BufferedReader variable to read the file
//		FileReader fileReader = null; // initialize a FileReader variable to read the file
		
		
		try (FileReader fileReader = new FileReader(file); 
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String line = bufferedReader.readLine(); // read the first line of the file
			
			while (line!= null) { // loop until the end of the file is reached
                System.out.println(line); // print the current line to the console
                line = bufferedReader.readLine(); // read the next line of the file
            }
			
		} catch (FileNotFoundException e) { // catch the FileNotFoundException if the file does not exist
            System.out.println("File not found");
		} catch (IOException e) { // catch any other IOException that might occur while reading the file
			System.out.println("Problems reading file" + file.getName()); // print an error message indicating that there was a problem reading the file
		} 
		
//		finally { // close the BufferedReader in the finally block to make sure it always gets closed
//				try {
//					
//					if (bufferedReader!= null) {
//						bufferedReader.close(); // close the BufferedReader
//					}
//					
//					if (fileReader!= null) {
//                        fileReader.close(); // close the FileReader
//                    }
//					
//				} catch (IOException e) {
//					e.printStackTrace(); // print the stack trace of any IOException that might occur while closing the BufferedReader
//				} 
//				
//				catch (NullPointerException e) {
//					System.out.println("File was probably never opened" + e); // print an error message indicating that the file was never opened
//				}
//		}
	}

}

