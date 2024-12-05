package finalM;
import java.awt.event.*;

	import java.util.Scanner;
	import java.io.FileWriter;
	import java.io.IOException;

	public class hotdog {
	    public static void main(String[] args) {
	        Scanner hotdog = new Scanner(System.in);

	        System.out.print("Enter your last name: ");
	        String lastName = hotdog.nextLine();

	        System.out.print("Enter your first name: ");
	        String firstName = hotdog.nextLine();
	        
	        System.out.print("Enter your middle initial: ");
	        String middleInitial = hotdog.nextLine();

	        String fullName = lastName + ", " + firstName + " " + middleInitial + ".";

	        try (FileWriter writer = new FileWriter("output.txt")) {
	            writer.write(fullName);
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }

	        hotdog.close();
	    }
	}
	



