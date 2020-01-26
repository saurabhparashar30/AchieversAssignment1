package Assignmnet;
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int arr[]=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        System.out.println("Enter rotations");
        rotate(arr,s1.nextInt());
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void rotate(int[] arr,int k){
        while(k!=-1){
            int temp=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            k--;
        }
    }
}
