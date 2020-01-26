package Assignmnet;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int[] arr=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        move0AtLast(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void move0AtLast(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
    }
}
