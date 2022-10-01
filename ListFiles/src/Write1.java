// import java.io.FileWriter;   // Import the FileWriter class
// import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter firstname: ");
		String fn = reader.nextLine();
		System.out.println("Enter lastname: ");
		String ln = reader.nextLine();
		System.out.println("New Entry: " + fn +" " + ln);
	}
}
