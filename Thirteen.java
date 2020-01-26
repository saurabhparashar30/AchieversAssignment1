package Assignmnet;

import java.util.Scanner;


public class Thirteen {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number to check power of 3");
        System.out.println(checkPower(s1.nextInt()));
    }
    static boolean checkPower(int n){
        if(n==3)
            return true;
        else if(n==0)
            return false;
        else if(n%3==0)
            return checkPower(n/3);
        else
            return false;
    }
}
