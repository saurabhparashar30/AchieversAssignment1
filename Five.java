package Assignmnet;

import java.util.Scanner;


public class Five {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int n=s1.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=s1.nextInt();
        rotate(n,arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    static void rotate(int N,int a[][]){
        for (int i = 0; i < N / 2; i++) { 
            for (int j = i; j < N - i - 1; j++){ 
                int temp = a[i][j]; 
                a[i][j] = a[N - 1 - j][i]; 
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
                a[j][N - 1 - i] = temp; 
            } 
        } 
    }
}
