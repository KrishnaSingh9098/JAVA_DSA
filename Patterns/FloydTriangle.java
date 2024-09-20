import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        
        int num = 1; // This will keep track of the current number to be printed
        
        for (int i = 0; i < n; i++) { // For each row
            for (int j = 0; j <= i; j++) { // Print numbers in each row
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner
    }
}
