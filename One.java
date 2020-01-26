package Assignmnet;

import java.util.Scanner;
import java.util.Arrays;
public class One {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int arr[]=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        Arrays.sort(arr);
        System.out.println("No of distict elements = "+distinct(arr));
    }
    public static int distinct(int[] arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
                count++;
        }
        return count;
    }
}
