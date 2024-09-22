import java.util.Scanner;

public class SumOfNnumbers {

    int sumN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i; // Accumulate the sum
        }
        return sum; // Return the total sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read user input
        SumOfNnumbers example = new SumOfNnumbers(); // Create an instance of SumOfNnumbers
        System.out.println("The sum of numbers from 0 to " + n + " is: " + example.sumN(n)); // Call the method and print the result
        sc.close(); // Close the scanner
    }
}
