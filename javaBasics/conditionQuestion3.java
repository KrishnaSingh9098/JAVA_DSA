package javaBasics;

import java.util.Scanner;

public class conditionQuestion3 {
    public static void main(String[] args) {   //Checking the week day name by taking AS number inoput from the java from 1 to 7
        Scanner sc = new Scanner(System.in);
        int weekDAys = sc.nextInt();
        if(weekDAys == 1){
            System.out.println("MONDAY");
        }
        else if(weekDAys == 2){
            System.out.println("TUESDAy");
        }
        else if(weekDAys == 3){
            System.out.println("WEDNESDAy");
        }
        else if(weekDAys == 4){
            System.out.println("THURSDAy");
        }
        else if(weekDAys == 5){
            System.out.println("FRIDAy");
        }
        else if(weekDAys == 6){
            System.out.println("SATURDAy");
        }
        else if(weekDAys == 7){
            System.out.println("SUNDAy");
        }
        else{
            System.out.println("PLEASE ENTER A VALID WEEKDAYS NUMBER");
        }
        sc.close();
    }
}
