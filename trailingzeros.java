import java.util.Scanner;
public class trailingzeros {
    public static void factorial(long n){
        long res =0;
        for(int i=5;i<=n;i*=5){
            res+=(n/i);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        factorial(n);
        s.close();
    }
}
