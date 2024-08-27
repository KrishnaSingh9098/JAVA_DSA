package RECURSION;
import java.util.Scanner;
public class SumOfnNAturalNUmbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      fun(n);
      System.out.println(fun(n));
      sc.close();
    }
    public static int fun(int n){
        if(n==0) return 0;
         return n+fun(n-1);
         
    }
}
