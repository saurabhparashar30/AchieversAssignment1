package Assignmnet;

import java.util.Scanner;


public class Nine {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int[] arr=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        System.out.println("Duplicates: "+checkDublicate(arr));
    }
    public static boolean checkDublicate(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }
}
