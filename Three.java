package Assignmnet;

import java.util.HashMap;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int[] arr=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        System.out.println("Unique element is "+findUnique(arr));
    }
    static int findUnique(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else{
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        for(int i:arr){
            if(hm.get(i)==1)
                return i;
        }
        return -1;
    }
}
