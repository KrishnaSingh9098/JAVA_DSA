package RECURSION;

import java.util.Scanner;

public class TailRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solve(n);// Yeh line Solve method ko call karti hai aur n ko argument ke roop mein pass
                 // karti hai
                 sc.close();
    }

    public static void Solve(int n) {
        if (n == 0)
            return;// Yeh line check karti hai ki agar n ki value 0 hai, to method ko return kar do
                   // aur execution ko end kar do. Yeh base case hai jo recursion ko stop karne ke
                   // liye use hota hai.
        System.out.println(n);
        Solve(n - 1);// Yeh line Solve method ko call karti hai aur n-1 ko argument ke roop mein pass
                     // karti hai. Yeh recursion ka part hai, jo n ko decrease karte hue method ko
                     // phir se call karta hai.
    }
}
