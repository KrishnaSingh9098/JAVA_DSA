package LOOPS;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i =0;i<=5;i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I AM OUT OF LOOP");
    }
}
