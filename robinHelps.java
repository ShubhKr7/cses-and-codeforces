/*
 Question link: https://codeforces.com/problemset/problem/2014/A
 */

import java.util.Scanner;

public class robinHelps {

    public static int calc(int []a, int k){
        int c=0,n=0;
        for(int i=0; i<a.length; i+=1){
            if(a[i]>=k) c+=a[i];
            else if(a[i]==0&&c>0) {c-=1;n+=1;}
        }
        return n;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i+=1){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int j=0; j<n; j+=1) a[j]=sc.nextInt();
            System.out.println(calc(a,k));
        }
        sc.close();
    }
}
