import java.util.Scanner;

public class TrianglePatternForNumbers {
   public static void main(String[] args) {
    Scanner swc = new Scanner(System.in);
    int n = swc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println(" ");
    }
    swc.close();
   } 
}
