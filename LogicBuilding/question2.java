import java.util.Scanner;

// Minimum Of Two Numbers
public class question2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // Read two integers from the user
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      // Compare the two numbers and print the minimum
      if (a < b) {
         System.out.println(a + " is the minimum.");
      } else {
         System.out.println(b + " is the minimum.");
      }
      
      // Close the scanner
      sc.close();
   }
}


