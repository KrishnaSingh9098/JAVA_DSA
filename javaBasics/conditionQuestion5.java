package javaBasics;
import java.util.Scanner;;
// CHECKING THE YEAR  IS LEAP YEAR OR NOT
public class conditionQuestion5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       boolean  x = (year % 4) == 0;
       boolean y = (year %100) !=0;
       boolean z =( (year % 100 ==0) && (year % 400 == 0));
       if(x && (y || z)){

        System.out.println(year + " is a leap year"); 
    } else { 
    System.out.println(year + " is not a leap year"); 
    }
    }
}
