package RECURSION;
import java.util.Scanner;

public class PrintX {
    Scanner sc = new Scanner(System.in);
    public static int power(int x, int n){
        if(n == 0) return 1;
        int Xnm1 = power(x,n-1);
        int xn = x*Xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
