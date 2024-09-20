import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        Scanner swc = new Scanner(System.in);
        int n = swc.nextInt();
        
        // Loop through rows in descending order
        for (int i = n; i > 0; i--) {
            // Print spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers for each row
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(); // Move to the next line
        }
        
        swc.close(); // Close the scanner
    }
}
