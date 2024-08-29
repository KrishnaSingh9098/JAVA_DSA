package SOMEIMPORTANTQUESTIONS;

public class TowerOfHanoi {
    public static void Tower(int n, String string, String string2, String string3){
   if(n == 1){
    System.out.println("Transfer daisk : " + n + "from" + string+"to" +string3);
    return;
   }
   Tower(n-1,string,string3,string2);
   System.out.println("Transfer daisk : " + n + "from" + string+"to" +string3);
   Tower(n-1,string2,string,string3);
    }
    public static void main(String[] args) {
        int n = 3;
        Tower(n,"S","H","D");
    }
}
