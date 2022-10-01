import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class WriteToFile {
	public static void main(String[] args) {
		try {
		  // Setup a scanner and get input
		  Scanner reader = new Scanner(System.in);
		  System.out.println("Enter firstname: ");
		  String firstName = reader.nextLine();
		  System.out.println("Enter lastname: ");
		  String lastName = reader.nextLine();

		  // Setup a file writer to capture to file.
		  FileWriter myWriter = new FileWriter("newmembers.txt", true);
		  myWriter.write(firstName +","+lastName+"\n");
		  myWriter.close();
		  System.out.println(firstName +" " + lastName +" added to file.\n");
		} catch (IOException e) {
		  System.out.println("An error occurred.");
		  e.printStackTrace();
		}	
	}
}
