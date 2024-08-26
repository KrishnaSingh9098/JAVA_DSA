package javaBasics;
import java.util.Scanner;
public class conditionsQuestion {
    public static void main(String[] args) { // print the number you are taking input from the user is greatger then or less then 0
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       if(number > 0){
        System.out.println("X is greater than 0");
       }
       else{
        System.out.println("X is Smaller than or equal than 0");
       }
    }
}
