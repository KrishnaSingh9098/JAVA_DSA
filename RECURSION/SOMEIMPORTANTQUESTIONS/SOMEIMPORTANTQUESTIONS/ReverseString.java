package SOMEIMPORTANTQUESTIONS;

public class ReverseString {
    public static void prontRev(String str,int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));

        prontRev(str,idx-1);
    }
    
    public static void main(String[] args) {
        String str = "ABCD";
        prontRev(str,str.length()-1);
    }
}
