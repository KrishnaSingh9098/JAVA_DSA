package RECURSION;
import java.util.Scanner;
//HEAD RECURSION CODE 
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solve(n);
        sc.close();
    }
    public static void Solve(int n){
        if(n == 0) return;
        Solve(n-1);
        System.out.println(n);
    }

    
}
