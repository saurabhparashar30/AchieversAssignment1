package Assignmnet;

import java.util.Scanner;


public class Eleven {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number");
        fizzBuzz(s1.nextInt());
    }
    public static void fizzBuzz(int n){
        String str[] = new String[n];
        str[0]=String.valueOf(1);
        System.out.println(str[0]);
        for(int i=0;i<str.length;i++){
            if((i+1)%3==0 && (i+1)%5==0)
                str[i]="FizzBuzz";
            else if((i+1)%3==0)
                str[i]="Fizz";
            else if((i+1)%5==0)
                str[i]="Buzz";
            else
                str[i]=String.valueOf(i+1);
        }
        for(String i:str)
            System.out.print(i+" ");
    }
}
