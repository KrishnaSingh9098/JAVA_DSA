package javaBasics;

import java.util.Scanner;

public class conditionsQustion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     boolean x = (a<b) ? true:false;
     int y = (a > b ) ? a : b;
     System.out.println(x);
     System.out.println(y);
    }
}