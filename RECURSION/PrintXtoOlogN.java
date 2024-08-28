package RECURSION;

public class PrintXtoOlogN {
    public static int  optimizedPower(int a , int n){
        if(n == 0) return 1;
        int halfPower = optimizedPower(a,n/2);
        int halfPowersq = halfPower * halfPower;
        if(n%2 != 0){
            halfPowersq=a*halfPowersq;
        }
        return halfPowersq;

    }
    public static void main(String[] args) {
        int a= 2;
        int n = 5;
        System.err.println(optimizedPower(a,n));
    }
}
