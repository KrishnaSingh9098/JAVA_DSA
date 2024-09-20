import java.util.Scanner;

public class ReverseTrianglePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    for(int i=0;i<num;i++){
        for(int j=i+1;j>0;j--){
            System.out.print(j);
        }
        System.out.println(" ");
    }
sc.close();
  }  
}
