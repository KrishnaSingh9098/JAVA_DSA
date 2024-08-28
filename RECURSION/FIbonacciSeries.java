package RECURSION;
import java.util.Scanner;
public class FIbonacciSeries {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     fun1(n);
     System.out.println();
     sc.close();
   } 
   public static void fun1(int n){
    if(n==0)return;
    fun1(n-1);
    System.out.println(n);
    fun1(n-1);
   }
}
