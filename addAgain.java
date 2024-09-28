/*
 Question Link: https://codeforces.com/problemset/problem/1999/A
 */

import java.util.Scanner;
public class addAgain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i+=1){
            int a= sc.nextInt();
            System.out.println((a%10)+(a/10));
        }
        sc.close();
    }
}
