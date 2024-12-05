import java.io.FileWriter;
import java.io.IOException;

public class app {
    public static void main(String[] args) {
        // Your name details
        String lastName = "Gwapo";
        String firstName = "Andrew";
        char middleInitial = 'M';

        // Display in console
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Initial: " + middleInitial);

        // Write to a text file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Last Name: " + lastName + "\n");
            writer.write("First Name: " + firstName + "\n");
            writer.write("Middle Initial: " + middleInitial + "\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
