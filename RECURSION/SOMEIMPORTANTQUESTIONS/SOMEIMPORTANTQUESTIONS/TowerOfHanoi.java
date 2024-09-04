package SOMEIMPORTANTQUESTIONS;

public class TowerOfHanoi {
    public static void Tower(int n, String H, String string2, String End){
   if(n == 1){
    System.out.println("Transfer daisk : " + n + "from" + H+"to" +End);
    return;
   }
   Tower(n-1,H,End,string2);
   System.out.println("Transfer daisk : " + n + "from" + H+"to" +End);
   Tower(n-1,string2,H,End);
    }
    public static void main(String[] args) {
        int n = 4;
        Tower(n,"S","H","D");
    }
}
