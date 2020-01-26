package Assignmnet;

import java.util.Scanner;


public class Saven {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int[] arr=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        addOne(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void addOne(int[] arr){
        if(arr[arr.length-1]==9){
            for(int i=arr.length-1;i>0;i--){
                if(arr[i]<9)
                    break;
                else if(arr[i]==9){
                    arr[i]=0;
                    arr[i-1]+=1;
                }
                else if(arr[i]==10){
                    arr[i]=0;
                    arr[i-1]+=1;
                }
            }
        }
        else arr[arr.length-1]+=1;
    }
}
