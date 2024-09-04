import java.util.Scanner;

public class question4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // Read the integer n from the user
      int n = sc.nextInt();
      
      // Initialize the sum variable
      int sum = 0;
      
      // Calculate the sum of natural numbers from 1 to n
      for (int count = 1; count <= n; count++) {
         sum += count;
      }
      
      // Print the sum
      System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
      
      // Close the scanner
      sc.close();
   }
}
