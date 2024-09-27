import java.util.*;
public class alternatingSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i+=1){
            int size=sc.nextInt();
            int a[]=new int[size];
            for(int j=0;j<size;j+=1) a[j]=sc.nextInt();
            int sum=0;
            for(int k=0;k<size;k+=1){
                if(k%2==0) sum+=a[k];
                else sum-=a[k];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
