package Assignmnet;

import java.util.Scanner;
import java.util.ArrayList;

public class Eight {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int[] arr1=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr1.length;i++)
            arr1[i]=s1.nextInt();
        System.out.println("Enter size of Second array");
        int[] arr2=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr2.length;i++)
            arr2[i]=s1.nextInt();
        System.out.println("Intersection elements: "+intersection(arr1,arr2));
    }
    public static ArrayList intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]!=-1 && arr2[j]!=-1 && arr1[i]==arr2[j]){
                    al.add(arr1[i]);
                    arr1[i]=-1;
                    arr2[j]=-1;
                }
            }
        }
        return al;
    }
}
