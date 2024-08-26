package JAvaQuestions;
import java.util.Scanner;;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS HERE");
        int MArks = sc.nextInt();
        String REportCard = MArks >= 33 ? "PASS" : "FAIL" ;
        System.out.println(REportCard);
    } 
}
