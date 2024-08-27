package RECURSION;
import java.util.Scanner;
// PRINTING A FACTORIALS OF NUMBERS
//THIS was also CALLED AS LINEAR RECURSION
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           Fact(n);
           System.out.println(Fact(n));
           sc.close();
    }
    public static int Fact(int n){
        if(n == 1) return 1;
        return n*Fact(n-1);
    }
}
