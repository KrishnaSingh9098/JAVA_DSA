import java.util.Scanner;

public class Newly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Corrected variable name to 'n'
        
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j); // Changed println to print for the same line
            }
            // Print decreasing numbers
            for (int j = i; j > 0; j--) {
                System.out.print(j); // Changed println to print for the same line
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner
    } 
}
