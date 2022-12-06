package ioexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
	public static void main(String[] args) throws FileNotFoundException
	{
		final String OUTPUT_DIRECTORY = "C:\\Users\\s1320619\\eclipse-workspace\\ioexception\\src\\ioexception\\outlines.txt";
		Scanner user = new Scanner(System.in);
		// MAC: Users/adnanhoti/Downloads/lines.txt
		// WINDOWS: C:\Users\s1320619\eclipse-workspace\ioexception\src\ioexception\lines.txt
		boolean goodInput = false;
		while (!goodInput) {
			System.out.println("Please enter the path to open the input file for example C:\\Downloads\\lines.txt : ");
			String userIN = user.nextLine();
			
			try {
				File inputFile = new File(userIN);
				PrintWriter outputFile = new PrintWriter(OUTPUT_DIRECTORY);
				Scanner in = new Scanner(inputFile);
				goodInput = true;
				while (in.hasNext()) {
					String what = in.nextLine();
					outputFile.println(what);	
				}
				in.close();
				outputFile.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR NOT A VALID FILE PATH");
				goodInput = false;
			}
		}
		user.close();
		System.out.println("complete");  
	}
}