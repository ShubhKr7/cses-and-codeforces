/*
 Question Link: https://codeforces.com/problemset/problem/2009/A
 */

import java.util.*;
public class minimize {
    
    public static int minValue(int a, int b){
        int res=Integer.MIN_VALUE;
        int c=a;
        while(c<=b){
            res=Math.max(res,((c-a)+(c-b)));
            c+=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(minValue(a,b));
            n-=1;
        }
        sc.close();
    }
}
