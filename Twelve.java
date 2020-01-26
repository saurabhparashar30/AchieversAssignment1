package Assignmnet;

import java.util.Scanner;


public class Twelve {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner s1=new Scanner(System.in);
        System.out.println("No. of primes: "+countPrimes(s1.nextInt()));
    }
    static int countPrimes(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(i==2)
                continue;
            else{
                boolean flag = true;
                for(int j=2;j<i/2;j++){
                    if(i%j==0)
                        flag=false;
                }
                if(flag){
                    System.out.println(i);
                    count++;
                }
            }
        }
        return count;
    }
}
