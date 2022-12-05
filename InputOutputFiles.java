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
	   Scanner user = new Scanner(System.in);
	   // Users/adnanhoti/Downloads/lines.txt
		System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
		String userIN = user.nextLine();

		user.close();
      File inputFile = new File(userIN);
      PrintWriter outputFile = new PrintWriter("src/outlines.txt");
     
      Scanner in = new Scanner(inputFile);
      while (in.hasNext()) 
      {
      String what =in.nextLine();
      outputFile.println(what);
      }
      in.close();
      outputFile.close();
      System.out.println("complete");
      
   }
}