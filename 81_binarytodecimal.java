import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        // Convert the binary number to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Display the result
        System.out.println("The decimal equivalent is: " + decimal);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
