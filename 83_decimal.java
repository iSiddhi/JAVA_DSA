import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary using Integer.toBinaryString() method
        String binary = Integer.toBinaryString(decimal);

        // Output the binary result
        System.out.println("Binary representation: " + binary);
    }
}
