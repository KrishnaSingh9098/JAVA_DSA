package RECURSION;
import java.util.Scanner;
// DECIMAL TO BINARY CONVERSION WITH THE HELP OF RECURSION
public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DTB(n);
        sc.close();
    }

    public static void DTB(int n){
        if(n ==0)return;
    System.out.println(n%2);
       DTB(n/2);
    }
}
