package Assignmnet;

import java.util.Scanner;
import java.util.HashSet;

public class Six {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        HashSet<Integer> hs=new HashSet<>();
        int n=s1.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            hs.add(s1.nextInt());
        }
        System.out.println("Enter target");
        int target=s1.nextInt();
        for(int i:hs){
            if(target-i==i)
                continue;
            else
                if(hs.contains(target-i))
                System.out.println(target-i+"  "+i);
        }
    }
}
