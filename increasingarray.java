import java.util.Scanner;
public class increasingarray{
    public static void solution(int n,long[] arr){
        long count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                count=count +(arr[i]-arr[i+1]);
                arr[i+1]=arr[i];
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextLong();
        }
        solution(n,arr);
        s.close();
    }
}