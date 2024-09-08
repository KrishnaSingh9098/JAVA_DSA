import java.util.Scanner;

public class charPattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {  // Loop for each row
        char ch = (char) ('A' + i);  // Determine the character to print, based on row number
        for (int j = 0; j < n; j++) {  // Loop for each column in the current row
            System.out.print(ch);  // Print the character
        }
        System.out.println();  // Move to the next line after printing all columns in the current row
    }
    sc.close();

}
}
