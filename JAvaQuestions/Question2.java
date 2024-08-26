package JAvaQuestions;

public class Question2 {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        if((A>=B) && (A>=C)){
            System.out.println("LARGER IS A");
        }
          else if(B>=C){
            System.out.println("LARGER IS B");
        }
        else {
            System.out.println("LARGER IS C");
        }
    }
}
