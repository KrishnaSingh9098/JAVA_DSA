import java.util.Scanner;

public class TrianglePatttrenFornewNumberPrinting {
     public static void main(String[] args) {
    Scanner swc = new Scanner(System.in);
    int n = swc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(i+1);
        }
        System.out.println(" ");
    }
    swc.close();
   } 
}
