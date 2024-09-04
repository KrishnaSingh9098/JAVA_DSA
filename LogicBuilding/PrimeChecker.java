import java.util.Scanner;

public class PrimeChecker {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // Read the integer from the user
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      
      // Check if the number is prime and print the result
      if (isPrime(number)) {
         System.out.println(number + " is a prime number.");
      } else {
         System.out.println(number + " is not a prime number.");
      }
      
      // Close the scanner
      sc.close();
   }
   
   // Method to check if a number is prime
   public static boolean isPrime(int num) {
      // Handle cases for numbers less than 2
      if (num <= 1) {
         return false;
      }
      // Check divisibility from 2 to the square root of num
      for (int i = 2; i * i <= num; i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}
